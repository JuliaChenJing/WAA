/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CalculatorJSFManagedBean {

    double num1, num2;
    double result;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void add() {
        result = num1 + num2;
    }

    public void subtract() {
        if (num1 >= num2) {
            result = num1 - num2;
        } else {
            result = num2 - num1;
        }
    }

    public void multiply() {
        result = num1 * num2;
    }

    public void divide() {
        result = num1 / num2;
    }

    public String calculate() {
        return null;
    }
}
