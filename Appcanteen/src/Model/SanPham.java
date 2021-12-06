/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class SanPham implements Serializable{
    private String productID,nameSP,unit;
    private double price;
    private String NCC;
    private int soluong;

    public SanPham() {
    }

    public SanPham(String productID, String nameSP, String unit, double price, String NCC,int soluong) {
        this.productID = productID;
        this.nameSP = nameSP;
        this.unit = unit;
        this.price = price;
        this.NCC = NCC;
        this.soluong = soluong;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

   
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getNameSP() {
        return nameSP;
    }

    public void setNameSP(String nameSP) {
        this.nameSP = nameSP;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNCC() {
        return NCC;
    }

    public void setNCC(String NCC) {
        this.NCC = NCC;
    }
    
    
    
}
