import static java.lang.System.out;

class Bike extends Vehicle {

    public Bike(String name) {
        super("bike");
        int i = 0;
        i++;
        out.println("id = " + i);


    }

    Bike() {


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
        int z = x * hourPrice();
        return z + entrancePrice();

    }


}
