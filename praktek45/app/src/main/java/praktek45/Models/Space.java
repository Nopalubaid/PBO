/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek45.Models;

/**
 *
 * @author Axioo Pongo
 */
public class Space {
    public int width;
    
    public Space(int widht){
        this.width = widht;
    }
    
    public void draw(){
        System.out.println("|"+" ".repeat(width)+"|");
    }
}
