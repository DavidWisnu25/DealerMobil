package table;

import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Customer;

/**
Kevin PK Wilson / A / 210711076
Gabriel David Wisnu Dewangga / A / 210711097
AG Arka Atmaja / A / 210711109
Axel Christian Nugroho / A / 210711114
 */


public class TableCustomer extends AbstractTableModel{
    private List<Customer> list;
    
    public TableCustomer(List<Customer> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getNama();
            case 1:
                return list.get(rowIndex).getAlamat();
            case 2:
                return list.get(rowIndex).getUmur();
            case 3:
                return list.get(rowIndex).getTanggalLahir();
            case 4:
                return list.get(rowIndex).getId();
            default:
                return null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Nama";
            case 1:
                return "Alamat";
            case 2:
                return "Umur";
            case 3:
                return "Tanggal Lahir";
            default:
                return null;
        }
    }
}
