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
public class TRUYEN extends SACHTRUYEN{
    private String theLoai;
    
    TRUYEN(){
        
     
    }
    
    TRUYEN(String maSachTruyen, String tenSachTruyen, double soLuong, double donGiaThue, String theLoai, double soLuocThue){
        this.maSachTruyen = maSachTruyen;
        this.tenSachTruyen = tenSachTruyen;
        this.soLuong = soLuong;
        this.donGiaThue = donGiaThue;
        this.theLoai = theLoai;
        this.soLuocThue = soLuocThue;
    }
    
    public void setTheLoai(String theLoai){
        this.theLoai = theLoai;
    }
    
    public String getTheLoai(){
        return theLoai;
    }
}
