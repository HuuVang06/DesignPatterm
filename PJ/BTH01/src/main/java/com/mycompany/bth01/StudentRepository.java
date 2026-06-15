/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth01;

/**
 *
 * @author admin
 */
public class StudentRepository {
    public StudentRepository(){}
    
    public static void save(Student student) {
        System.out.println("Saving student: " + student.getName());
    }
    
}
