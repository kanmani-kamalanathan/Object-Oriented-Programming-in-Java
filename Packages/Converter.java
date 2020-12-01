import pack1.*;
import java.lang.*;
import java.util.*;
public class Converter{
	public static void main(String[] args){
		Currency_con c=new Currency_con();
		Distance_con d=new Distance_con();
		Scanner s=new Scanner(System.in);
		System.out.println("Select \n1 for currency converter \n2 for distance converter");
		int choice=s.nextInt();
		switch(choice){
			case 1:
				c.currency(s);
				break;
			case 2:
				d.distance(s);
				break;
			default:
				System.out.println("Please choose an appropriate option!");
				break;
		}
	}
}
