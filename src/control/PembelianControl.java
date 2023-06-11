/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;

import dao.PembelianDAO;
import java.util.List;
import model.Pembelian;
import table.TablePembelian;

/**
Kevin PK Wilson / A / 210711076
Gabriel David Wisnu Dewangga / A / 210711097
AG Arka Atmaja / A / 210711109
Axel Christian Nugroho / A / 210711114
 */
public class PembelianControl {
    PembelianDAO pDao = new PembelianDAO();
    public void insertPembelian(Pembelian p){
        pDao.insertPembelian(p);
    }
    public List getListPembelian(String query){
        return pDao.getListPembelian(query);
    }
    public TablePembelian getTablePembelian(String query){
        List<Pembelian> list = getListPembelian(query);
        TablePembelian table = new TablePembelian(list);
        return table;
    }
}
