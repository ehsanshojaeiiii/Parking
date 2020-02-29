import java.util.*;

import static java.lang.System.out;

public class ParkingManager {

    int id;
    Map<String, Integer> map = new HashMap<>();
    Car carNoArgs;
    ArrayList<Vehicle> data = new ArrayList<>();
    Vehicle car = new Car();

    Vehicle bike = new Bike();


    public void add(int Scannerid, Scanner reader) {
//        reader = new Scanner(System.in);


        if (Scannerid == 1) {

            out.println("Please,enter entry hour: ");
            String carHourInput="" ;

            try {

                 carHourInput= reader.nextLine();

            } catch (InputMismatchException e) {
                out.println("Error!Please Enter Correct Input");
            }
            if (carHourInput >= 1 && carHourInput <= 24) {
                car.setEntryHour(carHourInput);
                data.add(car);
                id++;
                bike.setId(id);
                data.add(car);
                out.println("id :" + data.get(0).getId());


            } else {
                out.println("your number must between 1 , 24");
            }
        } else if (Scannerid == 2) {
            out.println("Please,enter entry hour: ");
            int bikeHour_inp = 0;

            try {
                bikeHour_inp = reader.nextInt();
            } catch (InputMismatchException e) {
                out.println("Error ! Please Enter Correct Input");
            }

            if (bikeHour_inp >= 1 && bikeHour_inp <= 24) {

                bike.setEntryHour(bikeHour_inp);
                data.add(bike);
                id++;
                bike.setId(id);
                data.add(bike);
                out.println("id :" + data.get(0).getId());

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
