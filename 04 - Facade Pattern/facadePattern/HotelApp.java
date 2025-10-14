package facadePattern;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HotelApp {

    public static void main (String args[]){

        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("\nHotel Service App");
            System.out.println();
            System.out.println("Select Sevice: " +
                    "\n[1] Valet Parking" +
                    "\n[2] HouseKeeping" +
                    "\n[3] Luggage Cart" +
                    "\n[4] Exit Application");

            System.out.print("Select Options: ");
            String option = scan.next();

            System.out.println();

            switch (option) {
                case "1":
                    System.out.print("Input Plate Number of Vehicle: ");
                    String plateNumber = scan.next();
                    HotelService valet = new Valet(plateNumber);
                    FrontDesk.delegateService(valet);
                    break;
                case "2":
                    System.out.print("Input Room Number: ");
                    String roomNumber = scan.next();
                    HotelService houseKeeping = new HouseKeeping(roomNumber);
                    FrontDesk.delegateService(houseKeeping);
                    break;
                case "3":
                    System.out.print("Input Number of carts need for luggage: ");
                    int numberOfCarts = scan.nextInt();
                    HotelService cart = new Cart(numberOfCarts);
                    FrontDesk.delegateService(cart);
                    break;
                case "4":
                    System.out.println("\nThank you for using Hotel Service App!" +
                            "\nExiting Application...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        }
    }
}
