package control;

import dao.PenjualanDAO;
import java.util.List;
import model.Penjualan;
import table.TablePenjualan;

/**
Kevin PK Wilson / A / 210711076
Gabriel David Wisnu Dewangga / A / 210711097
AG Arka Atmaja / A / 210711109
Axel Christian Nugroho / A / 210711114
 */


public class PenjualanControl {
    PenjualanDAO pDao = new PenjualanDAO();
    public void insertPenjualan(Penjualan p){
        pDao.insertPenjualan(p);
    }
    public List getListPenjualan(String query){
        return pDao.getListPenjualan(query);
    }
    public TablePenjualan getTablePenjualan(String query){
        List<Penjualan> list = getListPenjualan(query);
        TablePenjualan table = new TablePenjualan(list);
        return table;
    }
}
