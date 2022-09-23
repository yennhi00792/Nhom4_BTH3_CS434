/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTN_NHOM4;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class THETHUVIEN implements ITHETHUVIEN{
    private String maThe, tenChuThe, diaChi;
    private Date ngayHetHan;
    private double tienDaChi;
    
    THETHUVIEN(){
        
    }
    
    THETHUVIEN(String maThe, String tenChuThe, String diaChi){
        this.maThe = maThe;
        this.tenChuThe = tenChuThe;
        this.diaChi = diaChi;
    }
    
    THETHUVIEN(String maThe, String tenChuThe, String diaChi, Date ngayHetHan){
        this.maThe = maThe;
        this.tenChuThe = tenChuThe;
        this.diaChi = diaChi;
        this.ngayHetHan = ngayHetHan;
    }
    
    public void setMaThe(String maThe){
        this.maThe = maThe;
    }
    
    public String getMaThe(){
        return maThe;
    }
    
    public void setTenChuThe(String tenChuThe){
        this.tenChuThe = tenChuThe;
    }
    
    public String getTenChuThe(){
        return tenChuThe;
    }
    
    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    
    public String getDiaChi(){
        return diaChi;
    }
    
    public void setNgayHetHan(Date ngayHetHan){
        this.ngayHetHan = ngayHetHan;
    }
    
    public Date getNgayHetHan(){
        return ngayHetHan;
    }
    
    public void setTienDaChi(double tienDaChi){
        this.tienDaChi = tienDaChi;
    }
    
    public double getTienDaChi(){
        return tienDaChi;
    }
}
