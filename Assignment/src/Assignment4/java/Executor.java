package Assignment4.java;

import java.util.Scanner;

public class Executor {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice:");
        System.out.println("1 for AirIndia");
        System.out.println("2 for KingFisher");
        System.out.println("3 for Indigo");
        int choice = Integer.parseInt(sc.nextLine());

        
        System.out.println("Enter hours of travel:");
        int hours = Integer.parseInt(sc.nextLine());

        
        System.out.println("Enter cost per hour:");
        double costPerHour = Double.parseDouble(sc.nextLine());
        Airfare airfare;

        switch (choice) {
            case 1:
                airfare = new AirIndia(hours, costPerHour);
                break;
            case 2:
                airfare = new KingFisher(hours, costPerHour);
                break;
            case 3:
                airfare = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        airfare.display();

        sc.close();
    }
}


