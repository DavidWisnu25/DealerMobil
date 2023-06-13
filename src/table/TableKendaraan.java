package table;

import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Kendaraan;

/**
Kevin PK Wilson / A / 210711076
Gabriel David Wisnu Dewangga / A / 210711097
AG Arka Atmaja / A / 210711109
Axel Christian Nugroho / A / 210711114
 */


public class TableKendaraan extends AbstractTableModel {
    private List<Kendaraan> list;
    
    public TableKendaraan(List<Kendaraan> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getJenis();
            case 1:
                return list.get(rowIndex).getMerk();
            case 2:
                return list.get(rowIndex).getNama();
            case 3:
                DecimalFormat decimalFormat = new DecimalFormat("#.0");
                String formattedValue = decimalFormat.format(list.get(rowIndex).getHarga());
                return formattedValue;
            case 4:
                return list.get(rowIndex).getJumlah();
            case 5:
                return list.get(rowIndex).getId();
            default:
                return null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Jenis";
            case 1:
                return "Merk";
            case 2:
                return "Nama";
            case 3: 
                return "Harga";
            case 4:
                return "Jumlah";
            default:
                return null;
        }
    }
}
