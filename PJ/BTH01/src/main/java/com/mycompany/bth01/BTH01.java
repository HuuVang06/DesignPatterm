/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bth01;

/**
 *
 * @author admin
 */
public class BTH01 {

    public static void main(String[] args) {
        Student st1 = new Student("2451010011","Nguyen Van B",4.6);
        
        System.out.println(st1.getId());
        System.out.println(st1.getName());
        System.out.println(st1.getGpa());
        
        System.out.println("Action.....");
        StudentRepository repository = new StudentRepository();
        repository.save(st1);
    }
}
