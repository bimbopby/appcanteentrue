/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Administrator
 */
public class NhanVien {
    private int id_nv;
    private String name, gt;
    private int phone;
    private String posi;
    private int hsl;

    public NhanVien() {
    }

    public NhanVien(int id_nv, String name, String gt, int phone, String posi, int hsl) {
        this.id_nv = id_nv;
        this.name = name;
        this.gt = gt;
        this.phone = phone;
        this.posi = posi;
        this.hsl = hsl;
    }

    public int getId_nv() {
        return id_nv;
    }

    public void setId_nv(int id_nv) {
        this.id_nv = id_nv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPosi() {
        return posi;
    }

    public void setPosi(String posi) {
        this.posi = posi;
    }

    public int getHsl() {
        return hsl;
    }

    public void setHsl(int hsl) {
        this.hsl = hsl;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "id_nv=" + id_nv + ", name=" + name + ", gt=" + gt + ", phone=" + phone + ", posi=" + posi + ", hsl=" + hsl + '}';
    }
    
    
}
