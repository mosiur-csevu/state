/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statedemo;

/**
 *
 * @author Mosiur Rahman Sweet
 */
public class StateDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.MouseSelect();
        canvas.MouseMoved();
    }
    
}
