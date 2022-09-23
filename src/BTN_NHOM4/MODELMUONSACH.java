/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTN_NHOM4;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class MODELMUONSACH extends AbstractTableModel{
    ArrayList<MUONSACH> data;
    String colNames[] = {"STT", "Mã thẻ", "Mã sách", "Ngày mượn", "Ngày trả", "Tình trạng", "Tiền thuê" };
    Class<?> colClasses[] = {String.class, String.class, String.class, Date.class, Date.class, String.class, double.class};

    MODELMUONSACH(ArrayList<MUONSACH> ms) {
        data = ms;
    }
  
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return data.get(rowIndex).getMaMuonSach();
        }
        if (columnIndex == 1) {
            return data.get(rowIndex).getMaThe();
        }
        if (columnIndex == 2) {
            return data.get(rowIndex).getMaSachTruyen();
        }
        if (columnIndex == 3) {
            return data.get(rowIndex).getNgayMuon();
        }
        if (columnIndex == 4) {
            return data.get(rowIndex).getNgayTra();
        }
        if (columnIndex == 5) {
            if(data.get(rowIndex).isDaTra()){
                return "Đã trả";
            }
            else return "Chưa trả";
        }
        if (columnIndex == 6) {
            return data.get(rowIndex).getTienThue();
        }
        return null;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colNames[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return colClasses[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
}
