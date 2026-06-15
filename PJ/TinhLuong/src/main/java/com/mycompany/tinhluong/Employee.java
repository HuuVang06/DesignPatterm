/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tinhluong;

/**
 *
 * @author admin
 */
public abstract class Employee {
    protected String type;
    protected double salary;
    
    public Employee (String type,double salary){
        this.type = type;
        this.salary = salary;
    }
    public abstract double calSalary();

     public void printSalary(){
        System.out.println("Name: "+type);
        System.out.println("Salary: "+calSalary());
    }
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
