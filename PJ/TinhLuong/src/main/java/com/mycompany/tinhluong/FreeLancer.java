/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tinhluong;

/**
 *
 * @author admin
 */
public class FreeLancer extends Employee{

    public FreeLancer(String type, double salary) {
        super(type, salary);
    }
 
    @Override
    public double calSalary() {
        return salary * 1.2;
    }
    
}
