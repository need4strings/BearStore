package com.bearshop.mindswap;

import com.bearshop.mindswap.bears.Bear;

public class Main {
    public static void main(String[] args) {


        // SHOP 1
        Shop shop1 = new Shop("Toysaurus's");

        Bear bear1 = shop1.createBear();
        bear1.talk();
        Bear bear2 = shop1.createBear();
        bear2.talk();
        Bear bear3 = shop1.createBear();
        bear3.talk();
        Bear bear4 = shop1.createBear();
        bear4.talk();
        Bear bear5 = shop1.createBear();
        bear5.talk();
        bear5.talk();
        Bear bear6 = shop1.createBear();
        bear6.talk();

        // SHOP 2
        Shop shop2 = new Shop("IQUEIA");

        Bear bear7 = shop2.createBear();
        //bear7.talk();
        Bear bear8 = shop2.createBear();
        //bear8.talk();
        Bear bear9 = shop2.createBear();
        //bear9.talk();
        Bear bear10 = shop2.createBear();
        //bear10.talk();
        Bear bear11 = shop2.createBear();
        //bear11.talk();
        //bear11.talk();
        Bear bear12 = shop2.createBear();
        //bear12.talk();
        Bear bear13 = shop2.createBear();
        //bear12.talk();

        shop1.compareShops(shop2.getNumberOfBears(), shop2.getShopName());
    }
}
