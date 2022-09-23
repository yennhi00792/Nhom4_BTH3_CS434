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
public class DSMUONSACH {
    ArrayList<MUONSACH> list;
    DSMUONSACH(){
        list= new ArrayList<>();
    }
    
    public void Them(MUONSACH ms) {
        list.add(ms);
    }
    
    public void CapNhat(MUONSACH ms) {
        for (int i = 0; i < list.size(); i++) {
            if (ms.getMaMuonSach().equalsIgnoreCase(list.get(i).getMaMuonSach())) {
                list.set(i, ms);
            }
        }
    }
    
    public MUONSACH Tim(String mms) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaMuonSach().trim().equalsIgnoreCase(mms.trim())) {
                return list.get(i);
            }
        }
        return null;
    }
}
