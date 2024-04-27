/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek6.Models;

/**
 *
 * @author Axioo Pongo
 */
public class Space implements Component {
    public int width;
    
    public Space(int widht){
        this.width = widht;
    }
    
    @Override
    public void draw(){
        System.out.println("|"+" ".repeat(width)+"|");
    }
}
