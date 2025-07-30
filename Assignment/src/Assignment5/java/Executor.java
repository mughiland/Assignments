package Assignment5.java;
import java.util.Scanner;


public class Executor {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	    
	        String csv = sc.nextLine().trim();
	        String[] fields = csv.split(",", -1);
	        if (fields.length != 3) {
	            sc.close();
	            return;      // Invalid first line, exit.
	        }
	        String stageEvent = fields[0];
	        String customer   = fields[1];
	        int    noOfSeats  = Integer.parseInt(fields[2].trim());

	        TicketBooking tb = new TicketBooking(stageEvent, customer, noOfSeats);

	        /* Read choice */
	        if (!sc.hasNextLine()) {
	            sc.close();
	            return;
	        }
	        int choice = Integer.parseInt(sc.nextLine().trim());

	        /* Always print the common receipt first */
	        tb.printReceipt();

	        switch (choice) {
	            case 1: // Cash
	                if (sc.hasNextLine()) {
	                    int amount = Integer.parseInt(sc.nextLine().trim());
	                    tb.makePayment(amount);
	                }
	                break;

	            case 2: // Wallet
	                if (sc.hasNextLine()) {
	                    int amount = Integer.parseInt(sc.nextLine().trim());
	                    if (sc.hasNextLine()) {
	                        String walletNumber = sc.nextLine().trim();
	                        tb.makePayment(amount, walletNumber);
	                    }
	                }
	                break;

	            case 3: // Credit card
	                if (sc.hasNextLine()) {
	                    String holderName = sc.nextLine().trim();
	                    if (sc.hasNextLine()) {
	                        int amount = Integer.parseInt(sc.nextLine().trim());
	                        if (sc.hasNextLine()) {
	                            String cardType = sc.nextLine().trim();
	                            if (sc.hasNextLine()) {
	                                String ccv = sc.nextLine().trim();
	                                tb.makePayment(holderName, amount, cardType, ccv);
	                            }
	                        }
	                    }
	                }
	                break;

	            default:
	                System.out.println("Invalid choice");
	                break;
	        }
	        sc.close();
	    }
	}


