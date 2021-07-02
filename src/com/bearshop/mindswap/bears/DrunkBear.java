package com.bearshop.mindswap.bears;

public class DrunkBear extends Bear {

    // PROPERTIES
    private final int blackoutProbability = 20;
    private boolean isSleeping = false;

    public DrunkBear() {
        super();
    }

    /**
     * Make bear talk with conditions
     */
    public void talk() {
        fallAsleep();

        if (!isSleeping) {
            super.talk();
        }
    }

    /**
     * Make bear fall asleep with 20% chance
     */
    public void fallAsleep() {
        int chanceCalc = (int) (Math.random() * (100 - 1 + 1) - 1);

        if (chanceCalc <= blackoutProbability) {
            isSleeping = true;
            snore();
        }
    }

    /**
     * Make the bear snore
     */
    private void snore() {
        System.out.println("I'M TOO DRUNK I FELL ASLEEP ZZZZZ");
    }
}
