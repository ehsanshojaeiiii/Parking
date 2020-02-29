import static java.lang.System.*;

abstract class Vehicle {

    private int id;
    private int entryHour;
    private int exitHour;

    Vehicle(int id) {
        this.id=id;

    }

    Vehicle(int id,int entryHour,int exitHour) {
    }


    public abstract int entrancePrice();

    public abstract int hourPrice();

    public int getCost() {
        int x = entryHour - exitHour;
        int z = x * hourPrice();
        return z + entrancePrice();

    }

    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", entryHour=" + entryHour +
                ", exitHour=" + exitHour +
                '}';
    }
}
