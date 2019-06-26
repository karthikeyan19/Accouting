/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import com.jfoenix.controls.JFXTextField;

/**
 *
 * @author Karthikeyan
 */
public class NumberTextField extends JFXTextField {
    
    
    public NumberTextField(){
        this.setPromptText("Enter Only numbers");
    }
    @Override
    public void replaceText(int i, int il, String string){
        if(string.matches("^[0-9]*\\.{0,1}[0-9]*$") || string.isEmpty()){
            super.replaceText(i, il, string);
        }
    }

    @Override
    public void replaceSelection(String string){
        super.replaceSelection(string);
    }
}
