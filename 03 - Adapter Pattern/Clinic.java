package FactoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        printHeader();

        while (true) {
            printMenu();
            String raw = in.nextLine().trim();

            int choice;
            try {
                choice = Integer.parseInt(raw);
            } catch (NumberFormatException e) {
                printlnBox("Please enter 1, 2, or 3.");
                continue;
            }

            if (choice == 3) {
                printlnBox("Exiting... Thanks for visiting the clinic!");
                break;
            }

            switch (choice) {
                case 1 -> {
                    Dog dog = new Dog("German Shepherd");
                    PetRecord rec = new PetRecord("D01", "Bantay", dog);
                    printlnBox("You adopted a Dog!");
                    printPet(rec);
                    System.out.println("Breed: " + dog.getBreed());
                    printDivider();
                }
                case 2 -> {
                    Cat cat = new Cat(9);
                    PetRecord rec = new PetRecord("C01", "Muning", cat);
                    printlnBox("You adopted a Cat!");
                    printPet(rec);
                    System.out.println("Lives: " + cat.getNoOfLives());
                    printDivider();
                }
                default -> printlnBox("Invalid choice. Please choose 1, 2, or 3.");
            }
        }

        in.close();
    }

    private static void printHeader() {
        System.out.println("==========================================");
        System.out.println("        Virtual Pet Clinic (Factory Pattern)");
        System.out.println("==========================================");
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("+------------------ Main Menu -----------------+");
        System.out.println("| [1] Adopt a Dog                             |");
        System.out.println("| [2] Adopt a Cat                             |");
        System.out.println("| [3] Exit                                    |");
        System.out.println("+---------------------------------------------+");
        System.out.print("Enter your choice: ");
    }

    private static void printPet(PetRecord rec) {
        printDivider();
        System.out.println("Pet ID   : " + rec.getPetId());
        System.out.println("Pet Name : " + rec.getPetName());
        System.out.println("Pet Kind : " + rec.getPet().getClass().getSimpleName());
        System.out.println("Sound    : " + rec.getPet().makeSound());
        System.out.println("Play     : " + rec.getPet().play());
    }

    private static void printDivider() {
        System.out.println("------------------------------------------");
    }

    private static void printlnBox(String msg) {
        String line = "+" + "-".repeat(msg.length() + 2) + "+";
        System.out.println(line);
        System.out.println("| " + msg + " |");
        System.out.println(line);
    }
}
