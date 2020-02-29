import static java.lang.System.out;

class Bike extends Vehicle {

    public Bike(int id ) {

        super(id);


    }

    @Override
    public int entrancePrice() {
        final int x = 30000;
        return x;
    }

    @Override
    public int hourPrice() {
        final int x = 10000;
        return x;
    }


    @Override
    public int getCost() {
        int x = getEntryHour() - getExitHour();

        int z = Math.abs(x) * hourPrice();
        return z + entrancePrice();

    }


}
