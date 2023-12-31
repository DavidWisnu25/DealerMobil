package table;

import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Suplier;

/**
Kevin PK Wilson / A / 210711076
Gabriel David Wisnu Dewangga / A / 210711097
AG Arka Atmaja / A / 210711109
Axel Christian Nugroho / A / 210711114
 */


public class TableSuplier extends AbstractTableModel{
    private List<Suplier> list;
    
    public TableSuplier(List<Suplier> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getNama();
            default:
                return null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Nama";
            default:
                return null;
        }
    }
}
