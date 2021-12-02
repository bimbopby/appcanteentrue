/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.DBConfig.con;
import Model.SanPham;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Sanpham_Con extends DBConfig{

    public Sanpham_Con() {
        super();
    }
    public void ShowListSP(){
        
    }
    public boolean addSP(SanPham sp){
        String sql = "insert into product(id_pro, name_pro, unit, price, supplier)"+ "values (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sp.getProductID());
            ps.setString(2, sp.getNameSP());
            ps.setString(3, sp.getUnit());
            ps.setDouble(4, sp.getPrice());
            ps.setString(5, sp.getNCC());
            
            return ps.executeUpdate()>0;
            
        } catch (SQLException ex) {
            Logger.getLogger(Sanpham_Con.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public ArrayList<SanPham> getListSanPham(){
        ArrayList<SanPham> lst = new ArrayList<>();
       String sql = "select * from product" ;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                SanPham s = new SanPham();
                s.setProductID(rs.getString("id_pro"));
                s.setNameSP(rs.getString("name_pro"));
                s.setUnit(rs.getString("unit"));
                s.setPrice(rs.getDouble("price"));
                s.setNCC(rs.getString("supplier"));
                lst.add(s);

                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sanpham_Con.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lst;
    }
}
