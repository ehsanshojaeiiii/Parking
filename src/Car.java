

import static java.lang.System.*;

class Car extends Vehicle {

    public Car(int id ) {

        super(id);
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
        int z = Math.abs(x) * hourPrice();
        return z + entrancePrice();
    }


}
