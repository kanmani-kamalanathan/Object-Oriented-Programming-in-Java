import java.util.*;
import java.lang.*;
class ElectricityBill{
	public static void main(String...args){
		String consumer_no,consumer_name;
		double prev_month_reading,current_month_reading,no_units;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the customer no : ");
		consumer_no=scan.nextLine();
		System.out.println("Enter the customer name : ");
		consumer_name=scan.nextLine();
		System.out.println("Enter the previous month reading : ");
		prev_month_reading=scan.nextFloat();
		System.out.println("Enter the current month reading : ");
		current_month_reading=scan.nextFloat();
		no_units=current_month_reading - prev_month_reading;
		System.out.println("Select the type of electricity bill : ");
		System.out.println("1.Domestic");
		System.out.println("2.Commercial");
		int opt = scan.nextInt();
		switch(opt){
			case 1:
			System.out.println("-----------------------------------------------");
			System.out.println("Electricity Bill");
			System.out.println("-----------------------------------------------");
			System.out.println("Consumer name : "+consumer_name);
			System.out.println("Consumer no : "+consumer_no);
			System.out.println("No of Units : "+no_units);
			System.out.println("Electricity Bill : Rs."+domestic(no_units));
			System.out.println("-----------------------------------------------");
			break;
			case 2:
			System.out.println("-----------------------------------------------");
			System.out.println("Electricity Bill");
			System.out.println("-----------------------------------------------");
			System.out.println("Consumer name : "+consumer_name);
			System.out.println("Consumer no : "+consumer_no);
			System.out.println("No of Units : "+no_units);
			System.out.println("Electricity Bill : Rs."+commercial(no_units));
			System.out.println("-----------------------------------------------");
			break;
		}
	}
	public static double domestic(double units){
		double cost=0;
		if(units<=100)
			cost=units*1;
		else if(units>=101 && units<=200)
			cost=units*2.50;
		else if(units>=201 && units<=500)
			cost=units*4;
		else
			cost=units*6;
		return cost;
	}
	public static double commercial(double units){
		double cost=0;
		if(units<=100)
			cost=units*2;
		else if(units>=101 && units<=200)
			cost=units*4.50;
		else if(units>=201 && units<=500)
			cost=units*6;
		else
			cost=units*7;
		return cost;
	}
}
