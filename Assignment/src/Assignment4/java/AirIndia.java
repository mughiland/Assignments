package Assignment4.java;
import java.text.DecimalFormat;

public class AirIndia implements Airfare {
	private int hours;
    private double costPerHour;

    public AirIndia() {
        this.hours = 0;
        this.costPerHour = 0.0;
    }

    public AirIndia(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getCostPerHour() {
        return costPerHour;
    }
    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    public double calculateAmount() {
        return hours * costPerHour;
    }

    public void display() {
        double amount = calculateAmount();
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(amount));
    }
}


