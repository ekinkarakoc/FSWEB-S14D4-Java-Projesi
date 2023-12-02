package com.workintech.store.main;

import com.workintech.store.models.Bread;
import com.workintech.store.models.Chocolate;
import com.workintech.store.models.Coke;
import com.workintech.store.models.ProductForSale;

public class Store {
    public static void main(String[] args) {


        ProductForSale[] sales = new ProductForSale[3];


        sales[0] = new Chocolate("sweat", 20,"yazılımcı dostu", "brown", true);
        sales[1] = new Bread("Bakery", 40,"siyez unu", "einkorn", "brown");
        sales[2] = new Coke("Drinks", 15, "Soğuk iç", true, 1);

        listProducts(sales);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product: products){
            product.showDetails();
        }
    }
}