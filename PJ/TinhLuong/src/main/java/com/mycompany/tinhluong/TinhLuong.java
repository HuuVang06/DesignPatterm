/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tinhluong;

/**
 *
 * @author admin
 */
public class TinhLuong {

    public static void main(String[] args) {
        Employee f1 = new FullTime("FullTime", 8000000);
        f1.printSalary();
        
        Employee p1 = new PartTime("PartTime", 8000000);
        p1.printSalary();
    }
}
