package com.bearshop.mindswap.bears;

public class CrankyBear extends Bear {

    // PROPERTIES
    private boolean hasSung = false;

    public CrankyBear() {
        super();
    }

    /**
     * Make the bear talk
     */
    public void talk() {

        float batteryLevel = battery.getBatteryLevel();

        if (batteryLevel < 50) {

            if (!hasSung) {
                singSong();
            }
        } else {
            super.talk();
        }
    }

    /**
     * Make the bear sing
     */
    public void singSong() {
        System.out.println("HELLO DARKNESS MY OLD FRIEND...");
        hasSung = true;
    }
}
