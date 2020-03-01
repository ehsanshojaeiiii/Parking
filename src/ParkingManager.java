import java.util.*;

import static java.lang.System.out;

public class ParkingManager {

    int carHourInput = 0;

    int id = 0;

    ArrayList<Vehicle> data = new ArrayList<>();

    Vehicle vehicle;


    public void add() {


        Scanner in = new Scanner(System.in);

        out.println("*******************************");
        out.println("Add Vehicle");
        out.println("*******************************");
        out.println("1. Car");
        out.println("2. Bike");


        String add_inp = in.nextLine();
        boolean is_one = add_inp.startsWith("1");
        boolean is_two = add_inp.startsWith("2");
        if (is_one) {

            out.println("Please,enter entry hour: ");
            carHourInput = 0;

            try {


                carHourInput =in.nextInt();

            } catch (InputMismatchException e) {
                out.println("Error!Please Enter Correct Input");
            }
            if (carHourInput >= 1 && carHourInput <= 24) {
                id++;
                vehicle = new Car(id);
                vehicle.setEntryHour(carHourInput);
                data.add(vehicle);
                out.println("id :" + data.get(id - 1).getId());


            } else {
                out.println("your number must between 1 , 24");
            }
        } else if (is_two) {
            out.println("Please,enter entry hour: ");
            int bikeHourInput = 0;

            try {
                bikeHourInput = in.nextInt();
            } catch (InputMismatchException e) {
                out.println("Error ! Please Enter Correct Input");
            }

            if (bikeHourInput >= 1 && bikeHourInput <= 24) {

                id++;
                vehicle = new Bike(id);
                vehicle.setEntryHour(bikeHourInput);
                data.add(vehicle);
                out.println("id :" + data.get(id - 1).getId());


            } else {
                out.println("your number must between 1 , 24");
            }


        } else {
            out.println("Enter correct number !");
        }
    }

    public void remove() {
        Scanner in = new Scanner(System.in);
        if (!data.isEmpty()) {
            out.println("*******************************");
            out.println("Remove Vehicle");
            out.println("*******************************");
            out.println("Please, enter ID : ");


            int removeInputId = in.nextInt();
            boolean isContain = data.contains(removeInputId);
            if (isContain) {

                out.println("*******************************");
                out.println("Please, exit Hour : ");
                int removeExitHour = 0;

                removeExitHour = in.nextInt();

                if (removeExitHour >= 1 && removeExitHour <= 24) {

                    int indexOfid = data.indexOf(vehicle);

                    out.println(vehicle);
                    vehicle.setExitHour(removeExitHour);


                    out.println("this is list of vehicles ");
                    for (Vehicle i : data) {
                        out.println(i.toString());
                    }
                    out.println();


                    LastestPrint(indexOfid);


                } else {
                    out.println("your number must between 1 , 24");
                }
            } else {
                out.println("your id is not exist");
            }

        } else {
            out.println("Parking is empty");
        }


    }

    private void LastestPrint(int indexOfid) {

        out.println("*******************************");
        out.println("Bill");
        out.println("*******************************");
        out.println("Entry Hour : " + data.get(indexOfid).getEntryHour());
        out.println("Entry Hour : " + data.get(indexOfid).getExitHour());
        out.println("Total Price : " + vehicle.getCost());
    }
}
