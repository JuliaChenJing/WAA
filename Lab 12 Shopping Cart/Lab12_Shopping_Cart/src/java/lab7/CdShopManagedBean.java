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
public class CdShopManagedBean {

    private List<ShoppingCartItem> cdList;

    public CdShopManagedBean() {
        cdList = new ArrayList<ShoppingCartItem>();
        cdList.add(new ShoppingCartItem(1432, "The winnner takes it all", 12.95));
        cdList.add(new ShoppingCartItem(1321, "Yellow submarine", 11.35));
    }

    public List<ShoppingCartItem> getCdList() {
        return cdList;
    }

    public void setCdList(List<ShoppingCartItem> cdList) {
        this.cdList = cdList;
    }
}
