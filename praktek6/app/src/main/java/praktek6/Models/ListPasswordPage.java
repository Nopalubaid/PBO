/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek6.Models;

import java.util.ArrayList;
import static praktek6.Models.DataPassword.passData;

/**
 *
 * @author Axioo Pongo
 */
public class ListPasswordPage extends BasePage {
    
    public ListPasswordPage(int width){
        super("Password Yang Tersimpan", width);
    }
        
    @Override
    public void drawContent() {
        this.label.text = "Terdapat " + passData.size()+ " tersimpan.";
        this.label.draw();
        this.label.text = "---- ---- ----";
        this.label.draw();
        //menampilkan password
        ArrayList<PasswordStore> passwords = DataPassword.passData;
        for (PasswordStore password : passwords ) {
            
            String colName = String.format("|%-25s", password.name);
            String colUsername = String.format("|%-25s", password.username);
            String colCategory = String.format("|%-25s", password.getCategory());
            
            this.label.text = " " + colName + colUsername + colCategory;
            this.label.draw();
        }
        
        this.space.draw();
        new MainPage(width).draw();
    }
}
