/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTN_NHOM4;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class MODELTHETHUVIEN extends AbstractTableModel{
    
    ArrayList<THETHUVIEN> data;
    String colNames[] = {"Mã thẻ", "Chủ thẻ", "Địa chỉ", "Ngày hết hạn", "Tiền đã chi"};
    Class<?> colClasses[] = {String.class, String.class, String.class, Date.class, double.class};

    MODELTHETHUVIEN(ArrayList<THETHUVIEN> ttv) {
        data = ttv;
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
            return data.get(rowIndex).getMaThe();
        }
        if (columnIndex == 1) {
            return data.get(rowIndex).getTenChuThe();
        }
        if (columnIndex == 2) {
            return data.get(rowIndex).getDiaChi();
        }
        if (columnIndex == 3) {
            return data.get(rowIndex).getNgayHetHan();
        }
        if (columnIndex == 4) {
            return data.get(rowIndex).getTienDaChi();
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
