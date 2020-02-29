import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        ParkingManager parkingManager = new ParkingManager();
        String input = "";
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


                parkingManager.add();

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
