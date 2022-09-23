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
public class SACH extends SACHTRUYEN{
    private String chuyenNganh;
    
    SACH(){
        
   
    }
    
    SACH(String maSachTruyen, String tenSachTruyen, double soLuong, double donGiaThue, String chuyenNganh, double soLuocThue){
        this.maSachTruyen = maSachTruyen;
        this.tenSachTruyen = tenSachTruyen;
        this.soLuong = soLuong;
        this.donGiaThue = donGiaThue;
        this.chuyenNganh = chuyenNganh;
        this.soLuocThue = soLuocThue;
    }
    
    public void setChuyenNganh(String chuyenNganh){
        this.chuyenNganh = chuyenNganh;
    }
    
    public String getChuyenNganh(){
        return chuyenNganh;
    }
    
}
