/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek45.Models;
import java.util.Scanner;

/**
 *
 * @author Axioo Pongo
 */
public class Input {
    public String label;
    private Scanner input = new Scanner(System.in);;
    private String value;
    
    public Input(String label){
        this.label = label;
    }
    
    public void draw(){
        System.out.print("|  " + label + " : ");
    }
    
    public String getValue(){
        return input.nextLine();
    }
    
    public int getValueInt(){
        return input.nextInt();
    }
    
    public double getValueDouble(){
        return input.nextDouble();
    }
}
