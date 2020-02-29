import static java.lang.System.*;

abstract class Vehicle {

     int id;
    private int entryHour;
    private int exitHour;

    public Vehicle(String name) {


    }

     Vehicle() {
    }


    public abstract int entrancePrice();

    public abstract int hourPrice();

    public int getCost() {
        int x = entryHour - exitHour;
        int z = x * hourPrice();
        return z + entrancePrice();

    }


    public int getEntryHour() {
        return entryHour;
    }

    public void setEntryHour(int entryHour) {
        this.entryHour = entryHour;
    }

    public int getExitHour() {
        return exitHour;
    }

    public void setExitHour(int exitHour) {
        this.exitHour = exitHour;
    }
}
