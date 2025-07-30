package Assignment5.java;

public class TicketBooking {
	 private String stageEvent;
	    private String customer;
	    private int noOfSeats;

	    // Default constructor
	    public TicketBooking() {
	    }

	    // Parameterized constructor
	    public TicketBooking(String stageEvent, String customer, int noOfSeats) {
	        this.stageEvent = stageEvent;
	        this.customer = customer;
	        this.noOfSeats = noOfSeats;
	    }

	    // Getters and setters (if needed)
	    public String getStageEvent() { return stageEvent; }
	    public void setStageEvent(String stageEvent) { this.stageEvent = stageEvent; }

	    public String getCustomer() { return customer; }
	    public void setCustomer(String customer) { this.customer = customer; }

	    public int getNoOfSeats() { return noOfSeats; }
	    public void setNoOfSeats(int noOfSeats) { this.noOfSeats = noOfSeats; }

	    // Overloaded payment methods
	    public void makePayment(int amount) {
	        System.out.printf("Amount %.1f paid in cash\n", (double)amount);
	    }

	    public void makePayment(int amount, String walletNumber) {
	        System.out.printf("Amount %.1f paid using wallet number %s\n", (double)amount, walletNumber);
	    }

	    public void makePayment(String holderName, int amount, String creditCardType, String ccv) {
	        System.out.printf("Holder name:%s\n", holderName);
	        System.out.printf("Amount %.1f paid using %s card\n", (double)amount, creditCardType);
	        System.out.printf("CCV:%s\n", ccv);
	    }

	    // Print receipt
	    public void printReceipt() {
	        System.out.printf("Stage event:%s\n", stageEvent);
	        System.out.printf("Customer:%s\n", customer);
	        System.out.printf("Number of seats:%d\n", noOfSeats);
	    }
	}


