/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTN_NHOM4;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class MODELSACHTRUYEN extends AbstractTableModel{
    
    ArrayList<SACHTRUYEN> data;
    String colNames[] = {"Mã sách", "Tên sách", "Số lượng", "Đơn giá", "Lược Thuê", "CN/TL"};
    Class<?> colClasses[] = {String.class, String.class, double.class, double.class, double.class, String.class};

    MODELSACHTRUYEN(ArrayList<SACHTRUYEN> st) {
        data = st;
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
            return data.get(rowIndex).getMaSachTruyen();
        }
        if (columnIndex == 1) {
            return data.get(rowIndex).getTenSachTruyen();
        }
        if (columnIndex == 2) {
            return data.get(rowIndex).getSoLuong();
        }
        if (columnIndex == 3) {
            return data.get(rowIndex).getDonGiaThue();
        }
        if (columnIndex == 4) {
            return data.get(rowIndex).getSoLuocThue();
        }
        if (columnIndex == 5) {
            SACHTRUYEN st = data.get(rowIndex);
            if(st instanceof SACH){
                return ((SACH) st).getChuyenNganh();
            }
            if(st instanceof TRUYEN){
                return ((TRUYEN) st).getTheLoai();
            }
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
