/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;

import dao.SuplierDAO;
import java.util.List;
import model.Suplier;
import table.TableSuplier;

/**
 
 */
/**
Kevin PK Wilson / A / 210711076
Gabriel David Wisnu Dewangga / A / 210711097
AG Arka Atmaja / A / 210711109
Axel Christian Nugroho / A / 210711114
 */
public class SuplierControl {
    SuplierDAO sDao = new SuplierDAO();
    public void insertSuplier(Suplier s){
        sDao.insertSuplier(s);
    }
    public void updateSuplier(Suplier s){
        sDao.updateSuplier(s);
    }
    public void deleteSuplier(int id){
        sDao.deleteSuplier(id);
    }
    public List getListSuplier(String query){
        return sDao.getListSuplier(query);
    }
    public TableSuplier getTableSuplier(String query){
        List<Suplier> list = getListSuplier(query);
        TableSuplier table = new TableSuplier(list);
        return table;
    }
    public Suplier searchSuplier(String nama){
        return sDao.searchSuplier(nama);
    }
}
