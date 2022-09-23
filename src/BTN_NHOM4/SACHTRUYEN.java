/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTN_NHOM4;

/**
 *
 * @author Administrator
 */
public abstract class SACHTRUYEN implements ISACHTRUYEN{
    protected String maSachTruyen, tenSachTruyen;
    protected double soLuong, donGiaThue, soLuocThue;
    
    SACHTRUYEN(){
        
    }
    
    public void setMaSachTruyen(String maSachTruyen){
        this.maSachTruyen = maSachTruyen;
    }
    
    public String getMaSachTruyen(){
        return maSachTruyen;
    }
    
    public void setTenSachTruyen(String tenSachTruyen){
        this.tenSachTruyen = tenSachTruyen;
    }
    
    public String getTenSachTruyen(){
        return tenSachTruyen;
    }
    
    public void setSoLuong(double soLuong){
        this.soLuong = soLuong;
    }
    
    public double getSoLuong(){
        return soLuong;
    }
    
    public void setDonGiaThue(double donGiaThue){
        this.donGiaThue = donGiaThue;
    }
    
    public double getDonGiaThue(){
        return donGiaThue;
    }
    
    public void setSoLuocThue(double soLuocThue){
        this.soLuocThue = soLuocThue;
    }
    
    public double getSoLuocThue(){
        return soLuocThue;
    }
}
