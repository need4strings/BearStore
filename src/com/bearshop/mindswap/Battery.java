package com.bearshop.mindswap;

public class Battery {

    // PROPERTIES
    private float batteryLevel = 100;

    // METHODS

    /**
     * Check if bear has battery left
     * @return -> true / false
     */
    public boolean hasBattery() {
        return batteryLevel != 0;
    }

    /**
     * Get current battery level
     * @return -> current battery level
     */
    public float getBatteryLevel() {
        System.out.println("You now have this much battery: " + batteryLevel);
        return batteryLevel;
    }

    /**
     * Decrement battery level
     * @return -> new battery level after spending
     */
    public float setBatteryLevel() {
        batteryLevel -= 51;

        if (batteryLevel < 0) {
            batteryLevel = 0;
        }
        return batteryLevel;
    }
}
