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

@ManagedBean
@RequestScoped
public class ShoppingCartManagedBean {

    private List<ShoppingCartItem> shoppingCartList;

    private HashMap<Integer, Integer> quantityMap;

    private int quantity;

    public ShoppingCartManagedBean() {

        shoppingCartList = new ArrayList<ShoppingCartItem>();

        quantityMap = new HashMap<Integer, Integer>();

        shoppingCartList.add(new ShoppingCartItem(1432, "The winnner takes it all", 12.95,1));
        shoppingCartList.add(new ShoppingCartItem(1321, "Yellow submarine", 11.35,2));
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

}
