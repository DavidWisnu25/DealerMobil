package control;

import dao.CustomerDAO;
import java.util.List;
import model.Customer;
import table.TableCustomer;

/**
Kevin PK Wilson / A / 210711076
Gabriel David Wisnu Dewangga / A / 210711097
AG Arka Atmaja / A / 210711109
Axel Christian Nugroho / A / 210711114
 */

public class CustomerControl {
    CustomerDAO cDao = new CustomerDAO();
    public void insertCustomer(Customer c){
        cDao.insertCustomer(c);
    }
    public void updateCustomer(Customer c){
        cDao.updateCustomer(c);
    }
    public void deleteCustomer(int id){
        cDao.deleteCustomer(id);
    }
    public List getListCustomer(String query){
        return cDao.getListCustomer(query);
    }
    public TableCustomer getTableCustomer(String query){
        List<Customer> list = getListCustomer(query);
        TableCustomer table = new TableCustomer(list);
        return table;
    }
}
