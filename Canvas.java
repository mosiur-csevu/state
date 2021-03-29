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
public class Canvas {
    private Tool currentTool;
    
    public void MouseSelect() {
        currentTool.mouseSelected();
    }
    
    public void MouseMoved() {
        currentTool.mouseMoved();
    }
    
    public Tool getCurrentTool() {
       return currentTool;
    }
    public void setCurrentTool(Tool currentTool) {
       this.currentTool = currentTool;
    }
}
