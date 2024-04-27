/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek6.Models;



/**
 *
 * @author Axioo Pongo
 */
public class InputPage extends BasePage {
    private Input JudulInput;
    private Input Usernameinput;
    private Input Passwordinput;
    private SelectInput KategoriInput;
    
    public InputPage( int width){
        super("Aplikasi Penyimpanan Password", width);
        this.JudulInput = new Input ("Judul Password");
        this.Usernameinput = new Input ("Username");
        this.Passwordinput = new Input ("Password");
        String[] Kategorioptions = {"Belum terkategori", "Aplikasi WEB", "Aplikasi Mobile", "Akun Lainnya"};
        this.KategoriInput = new SelectInput ("Kategori", Kategorioptions, width);
    }    
    
    
    @Override
    public void drawContent() {
        this.JudulInput.draw();
        String Judul = JudulInput.getValue();
        this.Usernameinput.draw();
        String Username = Usernameinput.getValue();
        this.Passwordinput.draw();
        String Password = Passwordinput.getValue();
        this.KategoriInput.draw();
        int kategori = KategoriInput.getValue();
        
        PasswordStore passwordStore = new PasswordStore(Judul, Username, Password, kategori);
        DataPassword.passData.add(passwordStore);
        
        new MainPage(width).draw();
        
        
    }
    
}
