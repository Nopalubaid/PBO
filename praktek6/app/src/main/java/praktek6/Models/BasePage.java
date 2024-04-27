/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek6.Models;


import java.util.ArrayList;

/**
 *
 * @author Axioo Pongo
 */
public abstract class BasePage {
    public String title;
    public int width;
    protected HLine hline;
    protected Space space;
    protected Label label;
    protected ArrayList<Component> components ;
    
    public BasePage(String title, int width){
        this.title = title;
        this.width = width;
        this.hline = new HLine(this.width);
        this.space = new Space(this.width);
        this.label = new Label(title, width);
        this.components = new ArrayList();
    }
    
    public void draw(){
        this.drawHeader();
        this.space.draw();
        this.drawContent();
    }
    
    public void drawHeader(){
        this.hline.draw();
        this.space.draw();
        this.label.draw();
        this.space.draw();
        this.hline.draw();
    }
    
    public void drawFooter(){
        this.space.draw();
        this.hline.draw();
    }
    
    public abstract void drawContent();
}
