package pack1;
import java.util.Scanner;
public class Distance_con{
	public static void distance(Scanner scan){
		System.out.println("Choose the following :");
		System.out.println("1.Meters to KM");
		System.out.println("2.KM to Meters");
		System.out.println("3.Miles to KM");
		System.out.println("4.KM to Miles");
		int opt = scan.nextInt();
		double met , km ,miles;
		String str;
		switch(opt)
		{
			case 1 :
				System.out.println("Enter the metres to be converted to KM:");
				met = scan.nextFloat();
				km = met / (1000);
				System.out.printf("%.2fkm",km);
				System.out.println("\nExit? Y : N");
				str = scan.next();
				if( str.equals("N") || str.equals("n") )
				{
					distance(scan);
				}
				else
				{
					System.out.println("Thanks for using the converter ...!");
				}
				break;
			case 2:
				System.out.println("Enter the km to be converted to metres :");
				km = scan.nextFloat();
				met = km * (1000) ;
				System.out.printf("%.2fm",met);
				System.out.println("\nExit? Y : N");
				str = scan.next();
				if( str.equals("N") || str.equals("n") )
				{
					distance(scan);
				}
				else
				{
					System.out.println("Thanks for using the converter ...!");
				}
				break;
			case 3 :
				System.out.println("Enter the miles to be converted to KM:");
				miles = scan.nextFloat();
				km = miles / (0.621) ;
				System.out.printf("%.2fkm",km);
				System.out.println("\nExit? Y : N");
				str = scan.next();
				if( str.equals("N") || str.equals("n") )
				{
					distance(scan);
				}
				else
				{
					System.out.println("Thanks for using the converter ...!");
				}
				break;
			case 4:
				System.out.println("Enter the km to be converted to miles:");
				km = scan.nextFloat();
				miles = km * (0.621) ;
				System.out.printf("%.2f miles",miles);
				System.out.println("\nExit? Y : N");
				str = scan.next();
				if( str.equals("N") || str.equals("n") )
				{
					distance(scan);
				}
				else
				{
					System.out.println("Thanks for using the converter ...!");
				}
				break;
			default :
				System.out.println("Select one from the above options.");
				break;
		}
	}
}
