package pack1;
import java.util.Scanner;
public class Currency_con{
	public static void currency(Scanner scan){
		System.out.println("Choose the following :");
		System.out.println("1.Dollar to INR");
		System.out.println("2.INR to Dollar");
		System.out.println("3.EURO to INR");
		System.out.println("4.INR to EURO");
		System.out.println("5.Yen to INR");
		System.out.println("6.INR to Yen");
		int opt = scan.nextInt();
		double inr , usd ,euro,yen;
		String str;
		switch(opt)
		{
			case 1 :
				System.out.println("Enter the dollars to be converted to INR:");
				usd = scan.nextFloat();
				inr = usd * (68.45) ;
				System.out.printf("Rs.%.2f",inr);
				System.out.println("\nExit? Y : N");
				str = scan.next();
				if( str.equals("N") || str.equals("n") )
				{
					currency(scan);
				}
				else
				{
					System.out.println("Thanks for using the converter ...!");
				}
				break;
			case 2:
				System.out.println("Enter the rupees to be converted to dollars :");
				inr = scan.nextFloat();
				usd = inr / (68.45) ;
				System.out.printf("$%.2f",usd);
				System.out.println("\nExit? Y : N");
				str = scan.next();
				if( str.equals("N") ||str.equals("n") )
				{
					currency(scan);
				}
				else
				{
					System.out.println("Thanks for using the converter ...!");
				}
				break;
			case 3 :
				System.out.println("Enter the euros to be converted to INR:");
				euro = scan.nextFloat();
				inr = euro * (80.10) ;
				System.out.printf("Rs.%.2f",inr);
				System.out.println("\nExit? Y : N");
				str = scan.next();
				if( str.equals("N") || str.equals("n") )
				{
					currency(scan);
				}
				else
				{
					System.out.println("Thanks for using the converter ...!");
				}
				break;
			case 4:
				System.out.println("Enter the rupees to be converted to EURO:");
				inr = scan.nextFloat();
				euro = inr / (80.10) ;
				System.out.printf("E%.2f",euro);
				System.out.println("\nExit? Y : N");
				str = scan.next();
				if( str.equals("N") || str.equals("n") )
				{
					currency(scan);
				}
				else
				{
					System.out.println("Thanks for using the converter ...!");
				}
				break;
			case 5 :
				System.out.println("Enter the YEN to be converted to INR:");
				yen = scan.nextFloat();
				inr = yen * (0.62) ;
				System.out.printf("Rs.%.2f",inr);
				System.out.println("\nExit? Y : N");
				str = scan.next();
				if( str.equals("N") || str.equals("n") )
				{
					currency(scan);
				}
				else
				{
					System.out.println("Thanks for using the converter ...!");
				}
				break;
			case 6:
				System.out.println("Enter the rupees to be converted to YEN:");
				inr = scan.nextFloat();
				yen = inr / (0.62) ;
				System.out.printf("Y%.2f",yen);System.out.println("\nExit? Y : N");
				str = scan.next();
				if( str.equals("N") || str.equals("n") )
				{
					currency(scan);
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
