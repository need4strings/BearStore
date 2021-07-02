package com.bearshop.mindswap;

import com.bearshop.mindswap.bears.Bear;
import com.bearshop.mindswap.bears.CrankyBear;
import com.bearshop.mindswap.bears.DrunkBear;
import com.bearshop.mindswap.bears.SimpleBear;

public class Shop {

    // PROPERTIES
    private int numberOfBears;
    private String shopName;

    // METHODS
    public Shop(String shopName) {
        this.shopName = shopName;
    }

    /**
     * Create bear
     * @return -> created bear
     */
    public Bear createBear() {

        Bear bearCreated;
        numberOfBears++;

        if (numberOfBears % 2 == 0) {

            // criar simpleBear
            bearCreated = new SimpleBear();

        } else if (numberOfBears % 5 == 0) {

            // criar crankyBear
            bearCreated = new CrankyBear();

        } else {

            // criar drunkBear
            bearCreated = new DrunkBear();

        }

        return bearCreated;
    }

    /**
     * Compare the amount of bears sold by both shops
     * @param numberOfBearsOtherShop -> the number of bears the other store sold
     * @param otherShopName -> the other store's name
     */
    public void compareShops(int numberOfBearsOtherShop, String otherShopName) {

        if (numberOfBears < numberOfBearsOtherShop) {
            System.out.println("THE OTHER STORE SOLD MORE THAN US :( RESULTS: " + otherShopName + " - " + numberOfBearsOtherShop + " vs " + shopName + " - " + numberOfBears);
        } else if (numberOfBearsOtherShop == numberOfBears){
            System.out.println("WE SOLD THE SAME AMOUNT OF BEARS :| RESULTS: " + shopName + " - " + numberOfBearsOtherShop + " vs " + otherShopName + " - " + numberOfBears);
        } else {
            System.out.println("WE SOLD MORE BEARS YAY :D RESULTS: " + shopName + " - " + numberOfBearsOtherShop + " vs " + otherShopName + " - " + numberOfBears);
        }

    }

    /**
     * Get the number of bears sold by the shop
     * @return -> returns the number of bears sold
     */
    public int getNumberOfBears() {
        return numberOfBears;
    }

    /**
     * Get store's name
     * @return -> returns store's name
     */
    public String getShopName() {
        return shopName;
    }
}
