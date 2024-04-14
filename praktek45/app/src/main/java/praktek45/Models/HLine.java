/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek45.Models;

/**
 *
 * @author Axioo Pongo
 */
public class HLine {
    public int width;
    
    public HLine(int width){
        this.width = width;
    }
    
    public void draw(){
        System.out.println("+" + "=".repeat(width) + "+");
    }
}
