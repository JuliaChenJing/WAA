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
    private Employee onlyEmployee;

    public EmployeeManagedBean() {
        employeelist.add(new Employee(1432, "Frank Brown", "625-342-1221", 5032.45));
        employeelist.add(new Employee(1321, "John Doe ", "625-232-1677", 7032.45));
        employeelist.add(new Employee(1467, "Sam Zeren", "625-342-1221", 9032.45));
        employeelist.add(new Employee(6775, "Harry Don", "625-355-6721", 8952.45));
        onlyEmployee = employeelist.get(0);
    }
    public void setOnlyEmployee(Employee onlyEmployee) {
        this.onlyEmployee = onlyEmployee;
    }
    public Employee getOnlyEmployee(){
        return onlyEmployee;
    }
    public List<Employee> getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(List<Employee> employeelist) {
        this.employeelist = employeelist;
    }
    
    public String displayOnlyEmployee(int eid){
        for(Employee emp: employeelist){
            if(emp.getId() == eid){
                onlyEmployee = emp;
            }
        }
        return null;
    }
}
