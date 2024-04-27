/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek6.Models;

/**
 *
 * @author Axioo Pongo
 */
public class SelectInput implements Component {
    public String [] selection;
    public int width;
    public String label;
    private int value;
    Input input;
    
    public SelectInput(String label, String [] selection ,int width){
        this.label = label;
        this.selection = selection;
        this.width = width;
        input = new Input("Pilihan");
    }
    
    public void draw(){
        new Label(label,width).draw();
        int i=1;
        for(String select : selection){
            new Label(" ["+i+"] "+ select ,width).draw();
            i++;
        }
        input.draw();
    }
    
    public int getValue(){
        return input.getValueInt();
    }
}
