/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rectangle.square.lsp;

/**
 *
 * @author admin
 */
public class BadSquare extends BadRect {
        
    public BadSquare(double side) {
        super(side, side);    
    }
    
    @Override
    public void setWidth(double width){
        super.setHeight(width);
        super.setWidth(width);
    }
    
    @Override
    public void setHeight(double height){
        super.setHeight(height);
        super.setWidth(height);
    }
}
