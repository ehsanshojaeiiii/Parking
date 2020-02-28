package com.Chargoon;

import java.util.ArrayList;

import static java.lang.System.out;

class ParkingManager {
    ArrayList<AbstractVehicle> vehicles = new ArrayList<>();

    public void add() {
    }

    public void remove() {

    }


    protected void showMainMenu() {
        out.println("   ***********************");
        out.println("   Parking System Program");
        out.println("   ***********************");
        out.println("   1-Add Vehicle");
        out.println("   2-Remove Vehicle");
        out.println("   q-Quit");
    }

    protected  void showAddMenu() {
        out.println("   ***********************");
        out.println("   Add vehicle");
        out.println("   ***********************");
        out.println("   1-Car");
        out.println("   2-Bike");
    }
}
