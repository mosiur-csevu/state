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
public class SelectionTool implements Tool {

    @Override
    public void mouseMoved() {
        System.out.println("Draw a dotted rectangle");
    }

    @Override
    public void mouseSelected() {
        System.out.println("Selection Tool");
    }

}
