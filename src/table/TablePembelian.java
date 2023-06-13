package table;

import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Pembelian;

/**
Kevin PK Wilson / A / 210711076
Gabriel David Wisnu Dewangga / A / 210711097
AG Arka Atmaja / A / 210711109
Axel Christian Nugroho / A / 210711114
 */


public class TablePembelian extends AbstractTableModel{
    private List<Pembelian> list;
    
    public TablePembelian(List<Pembelian> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        String formattedValue = "";
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getTanggalPembelian();
            case 1:
                return list.get(rowIndex).getKendaraan().getNama();
            case 2:
                return list.get(rowIndex).getKendaraan().getMerk();
            case 3:
                return list.get(rowIndex).getKendaraan().getJenis();
            case 4:
                return list.get(rowIndex).getSuplier().getNama();
            case 5:
                formattedValue = decimalFormat.format(list.get(rowIndex).getKendaraan().getHarga());
                return formattedValue;
            case 6:
                return list.get(rowIndex).getJumlahSuplai();
            case 7:
                formattedValue = decimalFormat.format(list.get(rowIndex).getTotalHargaBeli());
                return formattedValue;
            case 8:
                return list.get(rowIndex).getSuplier().getId();
            case 9:
                return list.get(rowIndex).getKendaraan().getId();
            default:
                return null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Tanggal";
            case 1:
                return "Nama";
            case 2:
                return "Merk";
            case 3: 
                return "Jenis";
            case 4:
                return "Suplier";
            case 5:
                return "Harga";
            case 6:
                return "Jumlah";
            case 7:
                return "Total";
            default:
                return null;
        }
    }    
}
