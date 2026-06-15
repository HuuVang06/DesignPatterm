/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.khuyenmai;

/**
 *
 * @author admin
 */
public class KhuyenMai {

    public static void main(String[] args) {
        Discount d1 = new NoDiscount();
        Discount d2 = new PercentageDiscount(0.3);
        Discount d3 = new FixedAmountDiscount(500000);
        
        double price = 1000000;
        System.out.println(d1.apply(price));
        System.out.println(d2.apply(price));
        System.out.println(d3.apply(price));

    }
}
