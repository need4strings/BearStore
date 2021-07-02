package com.bearshop.mindswap.bears;

import com.bearshop.mindswap.Battery;

public class Bear {

    // PROPERTIES
    protected Battery battery = new Battery();

    // METHODS

    /**
     * Make the bear talk
     */
    public void talk() {

        boolean hasBattery = battery.hasBattery();

        if (hasBattery) {
            System.out.println("I LOVE YOU!");
            battery.setBatteryLevel();
            return;
        }
        System.out.println("BATTERY DEAD");
    }
}
