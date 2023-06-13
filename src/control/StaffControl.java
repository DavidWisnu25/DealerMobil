package control;

import dao.StaffDAO;
import java.util.List;
import model.Staff;
import table.TableStaff;

/**
Kevin PK Wilson / A / 210711076
Gabriel David Wisnu Dewangga / A / 210711097
AG Arka Atmaja / A / 210711109
Axel Christian Nugroho / A / 210711114
 */


public class StaffControl {
    StaffDAO sDao = new StaffDAO();
    public void insertStaff(Staff s){
        sDao.insertStaff(s);
    }
    public void updateStaff(Staff s){
        sDao.updateStaff(s);
    }
    public void deleteStaff(int id){
        sDao.deleteStaff(id);
    }
    public List getListStaff(String query){
        return sDao.getListStaff(query);
    }
    public TableStaff getTableStaff(String query){
        List<Staff> list = getListStaff(query);
        TableStaff table = new TableStaff(list);
        return table;
    }
}
