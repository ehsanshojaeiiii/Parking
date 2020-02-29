

import static java.lang.System.*;

class Car extends Vehicle {

    public Car(String name) {
        super("car");


    } public Car() {

    }




    @Override
    public int entrancePrice() {
        final int x = 50000;
        return x;
    }

    @Override
    public int hourPrice() {
        final int x = 20000;
        return x;
    }

    @Override
    public int getCost() {
        int x = getEntryHour() - getExitHour();
        int z = x * hourPrice();
        return z + entrancePrice();


    }


}
