/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTN_NHOM4;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Administrator
 */
public class MUONSACH implements IMUONSACH{
    private String maMuonSach, maThe, maSachTruyen;
    private Date ngayMuon, ngayTra;
    private boolean daTra;
    private double tienThue;
    
    MUONSACH(){
        
    }
    
    MUONSACH(String maMuonSach, String maThe, String maSachTruyen, Date ngayMuon, Date ngayTra,boolean daTra){
        this.maMuonSach = maMuonSach;
        this.maThe = maThe;
        this.maSachTruyen = maSachTruyen;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.daTra = daTra;
        this.tienThue = tienThue;
    }
    
    public void setMaMuonSach(String maMuonSach){
        this.maMuonSach = maMuonSach;
    }
    
    public String getMaMuonSach(){
        return maMuonSach;
    }
    
    public void setMaThe(String maThe){
        this.maThe = maThe;
    }
    
    public String getMaThe(){
        return maThe;
    }
    
    public void setMaSachTruyen(String maSachTruyen){
        this.maSachTruyen = maSachTruyen;
    }
    
    public String getMaSachTruyen(){
        return maSachTruyen;
    }
    
    public void setNgayMuon(Date ngayMuon){
        this.ngayMuon = ngayMuon;
    }
    
    public Date getNgayMuon(){
        return ngayMuon;
    }
    
    public void setNgayTra(Date ngayTra){
        this.ngayTra = ngayTra;
    }
    
    public Date getNgayTra(){
        return ngayTra;
    }
    
    public void setDaTra(boolean daTra){
        this.daTra = daTra;
    }
    
    public boolean isDaTra(){
        return daTra;
    }
    
    public void setTienThue(double tienThue){
        this.tienThue = tienThue;
    }
    
    public double getTienThue(){
        return tienThue;
    }
    
    public double tinhSoNgayThue(){
        if(ngayTra == null){
            Date homNay = new Date();
            return TimeUnit.MILLISECONDS.toDays(homNay.getTime()-ngayMuon.getTime())+1;
        }
        return TimeUnit.MILLISECONDS.toDays(ngayTra.getTime()-ngayMuon.getTime())+1;
    }
}
