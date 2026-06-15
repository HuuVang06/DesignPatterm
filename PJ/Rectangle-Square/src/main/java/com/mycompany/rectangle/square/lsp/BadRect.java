/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rectangle.square.lsp;

/**
 *
 * @author admin
 */
public class BadRect {
    private double width;
    private double height;

    public BadRect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double chuVi(){
        return (width +height) * 2;
    }
    
    public double dienTich(){
        return width*height;
    }
    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    
}
