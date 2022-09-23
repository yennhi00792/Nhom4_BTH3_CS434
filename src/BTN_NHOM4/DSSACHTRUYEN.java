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
public class DSSACHTRUYEN {
    ArrayList<SACHTRUYEN> list;
    DSSACHTRUYEN(){
        list= new ArrayList<>();
    }
    
    public void Them(SACHTRUYEN st) {
        list.add(st);
    }
    
    public void Xoa(String Masachtruyen) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaSachTruyen().trim().equalsIgnoreCase(Masachtruyen.trim())) {
                list.remove(i);
                break;
            }
        }
    }
    
    public void CapNhat(SACHTRUYEN st) {
        for (int i = 0; i < list.size(); i++) {
            if (st.getMaSachTruyen().equalsIgnoreCase(list.get(i).getMaSachTruyen())) {
                list.set(i, st);
            }
        }
    }
    
    public SACHTRUYEN Tim(String st) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaSachTruyen().trim().equalsIgnoreCase(st.trim())) {
                return list.get(i);
            }
        }
        return null;
    }
}
