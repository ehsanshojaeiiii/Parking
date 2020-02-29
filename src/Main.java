import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        ParkingManager parkingManager = new ParkingManager();
        String input = "";
        Scanner addScanner=null;
        while (true) {
            Scanner mainScanner = new Scanner(System.in);
            out.println("*******************************");
            out.println("Parking System Program");
            out.println("*******************************");
            out.println("1. Add Vehicle");
            out.println("2. Remove Vehicle");
            out.println("q. Quit");
            out.print(">>>");

            input = mainScanner.nextLine();

            if (input.equals("1")) {

                System.out.println("*******************************");
                System.out.println("Add Vehicle");
                System.out.println("*******************************");
                System.out.println("1. Car");
                System.out.println("2. Bike");

                int id=mainScanner.nextInt();
                parkingManager.add(id,mainScanner);

            } else if (input.equals("2")) {

                parkingManager.remove();

            } else if (input.toLowerCase().equals("q")) {

                out.println("Program Finished !");

                return;

            } else {

                out.println("Invalid choice!Try Again.");

            }
        }

    }


}
