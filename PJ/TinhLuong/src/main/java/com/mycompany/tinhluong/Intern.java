/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tinhluong;

/**
 *
 * @author admin
 */
public class Intern extends Employee{
    
    public Intern(String type, double salary) {
        super(type, salary);
    }

    @Override
    public double calSalary() {
        return salary * 0.3;
    }
    
}
