/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek6.Models;

/**
 *
 * @author Axioo Pongo
 */
public class HLine implements Component {
    public int width;
    
    public HLine(int width){
        this.width = width;
    }
    
    public void draw(){
        System.out.println("+" + "=".repeat(width) + "+");
    }
}
