package com.Chargoon;

import java.util.Scanner;

abstract class AbstractVehicle {
    private short id;
    private byte entryHour;
    private byte exitHour;


    public AbstractVehicle(short id) {
        this.id = id;

    }

    public abstract void entrancePrice();

    public abstract void hourPrice();

    public short getEntryHour() {
        return entryHour;
    }

    public void setEntryHour(byte entryHour) {
        this.entryHour = entryHour;
    }

    public short getExitHour() {
        return exitHour;
    }

    public void setExitHour(byte exitHour) {
        this.exitHour = exitHour;
    }
}
