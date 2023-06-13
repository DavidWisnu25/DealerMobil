package table;

import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Staff;

/**
Kevin PK Wilson / A / 210711076
Gabriel David Wisnu Dewangga / A / 210711097
AG Arka Atmaja / A / 210711109
Axel Christian Nugroho / A / 210711114
 */


public class TableStaff extends AbstractTableModel{
    private List<Staff> list;
    
    public TableStaff(List<Staff> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getJabatan();
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                DecimalFormat decimalFormat = new DecimalFormat("#.0");
                String formattedValue = decimalFormat.format(list.get(rowIndex).getGaji());
                return formattedValue;
            case 3:
                return list.get(rowIndex).getId();
            default:
                return null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "jabatan";
            case 1:
                return "Nama";
            case 2:
                return "Gaji";
            default:
                return null;
        }
    }
}
