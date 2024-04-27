/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek6.Models;

/**
 *
 * @author Axioo Pongo
 */
public class Label implements Component {
    public int width;
    public String text;
    
    public Label(String text, int width){
        this.width = width;
        this.text = text;
    }
    
    @Override
    public void draw(){
        if(text.length()>width){
            System.out.println("|"+" ".repeat(2)+ text + " "+"|");
        }else{
            System.out.println("|"+" ".repeat(2)+ text + " ".repeat(width-2-text.length())+"|");
        }   
    }
}
