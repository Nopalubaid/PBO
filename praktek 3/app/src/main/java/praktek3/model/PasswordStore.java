/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek3.model;

import java.util.Arrays;


/**
 *
 * @author Axioo Pongo
 */
public class PasswordStore {
    public String name, username;
    private String password, hashkey;
    private double score;
    private int category;
    public static final int UNCATEGORIZED = 0;
    public static final int CAT_WEBAPP = 1;
    public static final int CAT_MOBILEAPP = 2;
    public static final int CAT_OTHER = 3;
    
   
    public PasswordStore(String name, String username, String plainPass) throws Exception{
        this.name = name;
        this.username = username;
        hashkey = Encryptor.generateKey();
        setPassword(plainPass);
        this.category = UNCATEGORIZED;
    }
    public PasswordStore(String name, String username, String plainPass, int category) throws Exception{
        this(name, username, plainPass);
        setCategory(category);
        setPassword(plainPass);
    }
    public void setPassword(String plainPass) {
        try {
            this.password = Encryptor.encrypt( plainPass, hashkey);
        }catch(Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()) );
        }
        calculateScore(this.password);
    }
    public String getPassword(){
         try{
            return Encryptor.decrypt(password, hashkey);
         }catch (Exception e){
             return e.getMessage();
         }
    }
    public void setCategory(int category){
        if(category >=0 && category <=3){
            this.category = category;
        }else{
            this.category = 0;
        }
    }
    public String getCategory(){
        return switch (this.category) {
            case 0 -> "Belum terkategori";
            case 1 -> "Aplikasi Web";
            case 2 -> "Aplikasi Mobile";
            case 3 -> "Akun Lainnya";
            default -> "ada";
        };
    }
    private void calculateScore(String plainPass){
     
        if (plainPass.length()> 15){
            this.score = 10;
        }else{
           this.score = (plainPass.length() / 15f) * 10;
        }
    }
    
    @Override
    public String toString() {
        return "Username : "+username + "\nPassword : " + password + "\nHashkey : " + hashkey + "\nCategory: "+getCategory +"\nScore : " +score;
    }
}
