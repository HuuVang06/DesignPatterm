/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.printer;

/**
 *
 * @author admin
 */
public class Tester {
    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinter();
        oldPrinter.IPrinter();
        
        MultiFuncMachine multiFuncMachine = new MultiFuncMachine();
        multiFuncMachine.IPrinter();
        multiFuncMachine.IFax();
        multiFuncMachine.IScanner();

    }
}
