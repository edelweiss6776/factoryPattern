package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Select an option:");
            System.out.println("1. Create and display Canine (Dog)");
            System.out.println("2. Create and display Feline (Cat)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  
            switch (choice) {
                case 1:
                    System.out.print("Enter Dog's ID: ");
                    String dogID = scanner.nextLine();
                    System.out.print("Enter Dog's Name: ");
                    String dogName = scanner.nextLine();
                    System.out.print("Enter Dog's Breed: ");
                    String dogBreed = scanner.nextLine();

                    Animal dog = new Canine(dogBreed);
                    AnimalProfile dogProfile = new AnimalProfile(dogID, dogName, dog);
                    dogProfile.displayDetails();
                    break;

                case 2:
                    System.out.print("Enter Cat's ID: ");
                    String catID = scanner.nextLine();
                    System.out.print("Enter Cat's Name: ");
                    String catName = scanner.nextLine();
                    System.out.print("Enter Cat's Lives Left: ");
                    int catLivesLeft = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    Animal cat = new Feline(catLivesLeft);
                    AnimalProfile catProfile = new AnimalProfile(catID, catName, cat);
                    catProfile.displayDetails();
                    break;

                case 3:
                    keepRunning = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            System.out.println();  
        }

        scanner.close();
    }
}
