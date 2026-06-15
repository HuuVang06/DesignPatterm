/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.printer;

/**
 *
 * @author admin
 */
public class MultiFuncMachine implements IPrinter,IScanner, IFax {

    @Override
    public void IPrinter() {
        System.out.println("Printing...");
    }

    @Override
    public void IScanner() {
        System.out.println("Scanning...");

    }

    @Override
    public void IFax() {
        System.out.println("Faxing...");

    }
    
}
