/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.khuyenmai;

/**
 *
 * @author admin
 */
public class NoDiscount implements Discount {

    @Override
    public double apply(double price) {
        return price;
    }
    
}
