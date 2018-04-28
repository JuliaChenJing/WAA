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
public class EmployeeManagedBean {

    private List<Employee> employeelist = new ArrayList<>();
    private Employee selectedEmployee;

    public EmployeeManagedBean() {
        employeelist.add(new Employee(1432, "Frank Brown", "625-342-1221", 5032.45));
        employeelist.add(new Employee(1321, "John Doe ", "625-222-1677", 7032.45));
        employeelist.add(new Employee(1467, "Marry Jones", "625-342-1121", 9032.45));
        selectedEmployee = employeelist.get(0);
    }

    public void setSelectedEmployee(Employee SelectedEmployee) {
        this.selectedEmployee = SelectedEmployee;
    }

    public Employee getSelectedEmployee() {
        return selectedEmployee;
    }

    public List<Employee> getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(List<Employee> employeelist) {
        this.employeelist = employeelist;
    }

    public String displaySelectedEmployee(int eid) {
        for (Employee emp : employeelist) {
            if (emp.getId() == eid) {
                selectedEmployee = emp;
            }
        }
        return null;
    }
}
