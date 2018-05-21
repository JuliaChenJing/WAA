/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.faces.component.UIParameter;

@ManagedBean
@RequestScoped
public class ShoppingCartManagedBean {

    private List<ShoppingCartItem> shoppingCartList;

    private HashMap<Integer, Integer> quantityMap;

    private int quantity;

    public ShoppingCartManagedBean() {

        shoppingCartList = new ArrayList<ShoppingCartItem>();

        quantityMap = new HashMap<Integer, Integer>();

        shoppingCartList.add(new ShoppingCartItem("A1432", "The winnner takes it all", 12.95, 1));
        shoppingCartList.add(new ShoppingCartItem("A1321", "Yellow submarine", 11.35, 2));
        quantityMap.put(1432, 1);
        quantityMap.put(1321, 2);
    }

    public List<ShoppingCartItem> getShoppingCartList() {
        return shoppingCartList;
    }

    public void setShoppingCartList(List<ShoppingCartItem> shoppingCartList) {
        this.shoppingCartList = shoppingCartList;
    }

    public HashMap<Integer, Integer> getQuantityMap() {
        return quantityMap;
    }

    public void setQuantityMap(HashMap<Integer, Integer> quantityMap) {
        this.quantityMap = quantityMap;
    }

    public void removeFromCart(ActionEvent event) {

        UIParameter component = (UIParameter) event.getComponent().findComponent("id");
        String idToDelete = component.getValue().toString();
        for (ShoppingCartItem item : shoppingCartList) {
            if (idToDelete.equals(item.getId())) {
                shoppingCartList.remove(item);
            }
        }
    }

    public String updateShoppingCart() {
        return "shoppingCart";
    }

    public void addToCart(ActionEvent event) {

        UIParameter component1 = (UIParameter) event.getComponent().findComponent("id");
        String id = component1.getValue().toString();

        UIParameter component2 = (UIParameter) event.getComponent().findComponent("name");
        String name = component2.getValue().toString();
        UIParameter component3 = (UIParameter) event.getComponent().findComponent("price");
        String price = component3.getValue().toString();
        UIParameter component4 = (UIParameter) event.getComponent().findComponent("quantity");
        String quantity = component4.getValue().toString();

        shoppingCartList.add(new ShoppingCartItem(id, name, Double.parseDouble(price), Integer.parseInt(quantity)));
    }
}
