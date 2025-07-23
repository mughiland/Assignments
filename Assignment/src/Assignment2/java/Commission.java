package Assignment2.java;
import java.util.Scanner;

public class Commission {
	private String name;
	private String Address;
	private int ph;
	private int sales_amt;
	
	public void details() {
		Scanner bc=new Scanner(System.in);
		System.out.println("ENter NAme: ");
		name=bc.next();
		System.out.println("ENter Phone: ");
		ph=bc.nextInt();
		System.out.println("ENter Address: ");
		Address=bc.next();
		System.out.println("ENter Sales Amount: ");
		sales_amt=bc.nextInt();
	}
	
	public void calc() {
		int commision;
		
		if(sales_amt>=100000) {
			commision=((sales_amt)*10/100);
			
		}else if(sales_amt>= 50000) {
			commision=((sales_amt)*5/100);
			
		}else{
			commision=0;
			
		}
		
		System.out.println("NAMe: "+name);
		System.out.println("Address: "+Address);
		System.out.println("Sales Amount: "+sales_amt);
		System.out.println("Commision : "+commision);
	}
}


