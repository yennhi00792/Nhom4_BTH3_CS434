/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTN_NHOM4;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DSTHETHUVIEN {
    ArrayList<THETHUVIEN> list;
    DSTHETHUVIEN(){
        list= new ArrayList<>();
    }
    
    public void Them(THETHUVIEN ttv) {
        list.add(ttv);
    }
    
    public void Xoa(String Mathe) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaThe().trim().equalsIgnoreCase(Mathe.trim())) {
                list.remove(i);
                break;
            }
        }
    }
    
    public void CapNhat(THETHUVIEN ttv) {
        for (int i = 0; i < list.size(); i++) {
            if (ttv.getMaThe().equalsIgnoreCase(list.get(i).getMaThe())) {
                list.set(i, ttv);
            }
        }
    }
   
    public THETHUVIEN Tim(String ttv) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaThe().trim().equalsIgnoreCase(ttv.trim())) {
                return list.get(i);
            }
        }
        return null;
    }
}
