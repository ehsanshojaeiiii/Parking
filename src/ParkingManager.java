import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class ParkingManager {

    //    LinkedList<Car> carLinkedList = new LinkedList<>();
//    LinkedList<Bike> bikeLinkedList = new LinkedList<>();
    LinkedList<Integer> bikesandcars = new LinkedList<>();
    List<Vehicle> vehicles=new ArrayList<>();
    Car car_noargs = new Car();
    Bike bike_noargs = new Bike();


    public void add() {
        Scanner in = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("Add Vehicle");
        System.out.println("*******************************");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        String add_inp = in.nextLine();
        boolean is_one = add_inp.startsWith("1");
        boolean is_two = add_inp.startsWith("2");

        if (is_one) {
            out.println("Please,enter entry hour: ");
            int carHourInput = 0;

            try {

                carHourInput = in.nextInt();

            } catch (InputMismatchException e) {
                out.println("Error!Please Enter Correct Input");
            }
            if (carHourInput >= 1 && carHourInput <= 24) {
                car_noargs.setEntryHour(carHourInput);
                bikesandcars.add(car_noargs.id);
                Car mycar = new Car("car");
            } else {
                out.println("your number must between 1 , 24");
            }
        } else if (is_two) {
            out.println("Please,enter entry hour: ");
            int bikeHour_inp = 0;

            try {
                bikeHour_inp = in.nextInt();
            } catch (InputMismatchException e) {
                out.println("Error ! Please Enter Correct Input");
            }

            if (bikeHour_inp >= 1 && bikeHour_inp <= 24) {
                bike_noargs.setEntryHour(bikeHour_inp);
                bikesandcars.add(bike_noargs.id);
                Bike mybike = new Bike("bike");
            } else {
                out.println("your number must between 1 , 24");
            }


        } else {
            out.println("Enter correct number !");
        }
    }

    public void remove() {
        Scanner in = new Scanner(System.in);

        System.out.println("*******************************");
        System.out.println("Remove Vehicle");
        System.out.println("*******************************");
        System.out.println("Please, enter ID : ");




    }
}
