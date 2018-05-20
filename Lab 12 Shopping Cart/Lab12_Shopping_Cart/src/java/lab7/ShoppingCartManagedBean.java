/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ShoppingCartManagedBean {

    private List<ShoppingCartItem> employeelist = new ArrayList<>();
    private ShoppingCartItem selectedEmployee;

    public ShoppingCartManagedBean() {
        employeelist.add(new ShoppingCartItem(1432, "The winnner takes it all", 12.95));
        employeelist.add(new ShoppingCartItem(1321, "Yellow submarine", 11.35));
    }

    public void setSelectedEmployee(ShoppingCartItem SelectedEmployee) {
        this.selectedEmployee = SelectedEmployee;
    }

    public ShoppingCartItem getSelectedEmployee() {
        return selectedEmployee;
    }

    public List<ShoppingCartItem> getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(List<ShoppingCartItem> employeelist) {
        this.employeelist = employeelist;
    }
}
