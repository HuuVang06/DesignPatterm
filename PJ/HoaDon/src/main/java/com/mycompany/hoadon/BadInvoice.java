/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoadon;

/**
 *
 * @author admin
 */
public class BadInvoice {
    private double tinhTien;
    private String id;

    /**
     * @return the tinhTien
     */
    public double getTinhTien() {
        return tinhTien;
    }

    /**
     * @param tinhTien the tinhTien to set
     */
    public void setTinhTien(double tinhTien) {
        this.tinhTien = tinhTien;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
    public BadInvoice(String id, double tinhTien){
        this.id = id;
        this.tinhTien = tinhTien;
    }
    
    
    public double tinhThue(){
        return tinhTien*0.1;
    }
    
    public void printInvoice(){
        System.out.println("ID: "+id);
        System.out.println("Tong Tien: "+tinhTien);
        System.out.println("Thue:"+tinhThue());
        double tinhTong = tinhTien + tinhThue();
        
    }
}
