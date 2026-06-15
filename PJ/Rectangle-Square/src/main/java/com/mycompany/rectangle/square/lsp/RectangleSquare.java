/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangle.square.lsp;

/**
 *
 * @author admin
 */
public class RectangleSquare {

    public static void test(BadRect rect) {
        rect.setHeight(5);
        rect.setWidth(4);
        
        System.out.println("Area = "+ rect.dienTich() );
    }
    
    public static void main(String[] args) {
        BadRect hcn = new BadRect(2, 3);
        test(hcn);
        
        BadRect hv = new BadSquare(2);
        test(hv);
    }
}
