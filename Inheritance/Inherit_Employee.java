import java.lang.*;
import java.util.*;
public class Inherit_Employee{
	String name,id,address,mail_id,mobile;
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Choose the employee category:");
		System.out.println("1.Programmer");
		System.out.println("2.Assistant Professor");
		System.out.println("3.Associate Professor");
		System.out.println("4.Professor");
		int cat = s.nextInt();
		switch(cat){
			case 1:
				Programmer prog = new Programmer();
				prog.read();
				prog.calculate();
				prog.display();
				break;
			case 2:
				AssistantProfessor assist = new AssistantProfessor();
				assist.read();
				assist.calculate();
				assist.display();
				break;
			case 3:
				AssociateProfessor assoc = new AssociateProfessor();
				assoc.read();
				assoc.calculate();
				assoc.display();
				break;
			case 4:
				Professor prof = new Professor();
				prof.read();
				prof.calculate();
				prof.display();
				break;
			default:
				System.out.println("Choose the above category!");
				break;
		}
	}
}
class Programmer extends Inherit_Employee{
	double basic,da,hra,pf,fund;
	double gross,net;
	Scanner s = new Scanner(System.in);
	public void read(){
		System.out.println("Enter the empolyee name : ");
		name = s.nextLine();
		System.out.println("Enter the employee id : ");
		id = s.nextLine();
		System.out.println("Enter the employee address : ");
		address = s.nextLine();
		System.out.println("Enter the employee mail_id : ");
		mail_id = s.nextLine();
		System.out.println("Enter the employee mobile : ");
		mobile = s.next();
		if(mobile.length()!=10){
			System.out.println("Enter the correct mobile number : ");
			mobile = s.next();
		}
		System.out.println("Enter the basic pay (BP) : ");
		basic = s.nextFloat();
	}
	public void calculate(){
		da=(basic*97)/100;
		hra=(basic*10)/100;
		pf=(basic*12)/100;
		fund=(basic*0.1)/100;
		gross=basic+da+hra;
		net=gross-pf-fund;
	}
	public void display(){
		System.out.println("Employee name : "+name);
		System.out.println("Employee id : "+id);
		System.out.println("Employee address : "+address);
		System.out.println("Employee mail : "+mail_id);
		System.out.println("Employee mobile : "+mobile);
		System.out.println("-------------------------------------------------------------");
		System.out.println("                    PAY SLIP(Programmer)                     ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("   DA        :Rs."+da+"\t\t"+"PF         :Rs."+pf);
		System.out.println("   HRA       :Rs."+hra+"\t\t\t"+"FUND       :Rs."+fund);
		System.out.println("-------------------------------------------------------------");
		System.out.println("Gross salary :Rs."+gross+"\t\t"+"Net salary :Rs."+net);
		System.out.println("-------------------------------------------------------------");
	}
}
class AssistantProfessor extends Inherit_Employee{
	double basic,da,hra,pf,fund;
	double gross,net;
	Scanner s = new Scanner(System.in);
	public void read(){
		System.out.println("Enter the empolyee name : ");
		name = s.nextLine();
		System.out.println("Enter the employee id : ");
		id = s.nextLine();
		System.out.println("Enter the employee address : ");
		address = s.nextLine();
		System.out.println("Enter the employee mail_id : ");
		mail_id = s.nextLine();
		System.out.println("Enter the employee mobile : ");
		mobile = s.next();
		if(mobile.length()!=10){
			System.out.println("Enter the correct mobile number : ");
			mobile = s.next();
		}
		System.out.println("Enter the basic pay (BP) : ");
		basic = s.nextFloat();
	}
	public void calculate(){
		da=(basic*97)/100;
		hra=(basic*10)/100;
		pf=(basic*12)/100;
		fund=(basic*0.1)/100;
		gross=basic+da+hra;
		net=gross-pf-fund;
	}
	public void display(){
		System.out.println("Employee name : "+name);
		System.out.println("Employee id : "+id);
		System.out.println("Employee address : "+address);
		System.out.println("Employee mail : "+mail_id);
		System.out.println("Employee mobile : "+mobile);
		System.out.println("-------------------------------------------------------------");
		System.out.println("               PAY SLIP(Assistant Professor)                 ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("   DA        :Rs."+da+"\t\t"+"PF         :Rs."+pf);
		System.out.println("   HRA       :Rs."+hra+"\t\t\t"+"FUND       :Rs."+fund);
		System.out.println("-------------------------------------------------------------");
		System.out.println("Gross salary :Rs."+gross+"\t\t"+"Net salary :Rs."+net);
		System.out.println("-------------------------------------------------------------");
	}
}
class AssociateProfessor extends Inherit_Employee{
	double basic,da,hra,pf,fund;
	double gross,net;
	Scanner s = new Scanner(System.in);
	public void read(){
		System.out.println("Enter the empolyee name : ");
		name = s.nextLine();
		System.out.println("Enter the employee id : ");
		id = s.nextLine();
		System.out.println("Enter the employee address : ");
		address = s.nextLine();
		System.out.println("Enter the employee mail_id : ");
		mail_id = s.nextLine();
		System.out.println("Enter the employee mobile : ");
		mobile = s.next();
		if(mobile.length()!=10){
			System.out.println("Enter the correct mobile number : ");
			mobile = s.next();
		}
		System.out.println("Enter the basic pay (BP) : ");
		basic = s.nextFloat();
	}
	public void calculate(){
		da=(basic*97)/100;
		hra=(basic*10)/100;
		pf=(basic*12)/100;
		fund=(basic*0.1)/100;
		gross=basic+da+hra;
		net=gross-pf-fund;
	}
	public void display(){
		System.out.println("Employee name : "+name);
		System.out.println("Employee id : "+id);
		System.out.println("Employee address : "+address);
		System.out.println("Employee mail : "+mail_id);
		System.out.println("Employee mobile : "+mobile);
		System.out.println("-------------------------------------------------------------");
		System.out.println("               PAY SLIP(Associate Professor)                 ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("   DA        :Rs."+da+"\t\t"+"PF         :Rs."+pf);
		System.out.println("   HRA       :Rs."+hra+"\t\t\t"+"FUND       :Rs."+fund);
		System.out.println("-------------------------------------------------------------");
		System.out.println("Gross salary :Rs."+gross+"\t\t"+"Net salary :Rs."+net);
		System.out.println("-------------------------------------------------------------");
	}
}
class Professor extends Inherit_Employee{
	double basic,da,hra,pf,fund;
	double gross,net;
	Scanner s = new Scanner(System.in);
	public void read(){
		System.out.println("Enter the empolyee name : ");
		name = s.nextLine();
		System.out.println("Enter the employee id : ");
		id = s.nextLine();
		System.out.println("Enter the employee address : ");
		address = s.nextLine();
		System.out.println("Enter the employee mail_id : ");
		mail_id = s.nextLine();
		System.out.println("Enter the employee mobile : ");
		mobile = s.next();
		if(mobile.length()!=10){
			System.out.println("Enter the correct mobile number : ");
			mobile = s.next();
		}
		System.out.println("Enter the basic pay (BP) : ");
		basic = s.nextFloat();
	}
	public void calculate(){
		da=(basic*97)/100;
		hra=(basic*10)/100;
		pf=(basic*12)/100;
		fund=(basic*0.1)/100;
		gross=basic+da+hra;
		net=gross-pf-fund;
	}
	public void display(){
		System.out.println("Employee name : "+name);
		System.out.println("Employee id : "+id);
		System.out.println("Employee address : "+address);
		System.out.println("Employee mail : "+mail_id);
		System.out.println("Employee mobile : "+mobile);
		System.out.println("-------------------------------------------------------------");
		System.out.println("                      PAY SLIP(Professor)                    ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("   DA        :Rs."+da+"\t\t"+"PF         :Rs."+pf);
		System.out.println("   HRA       :Rs."+hra+"\t\t\t"+"FUND       :Rs."+fund);
		System.out.println("-------------------------------------------------------------");
		System.out.println("Gross salary :Rs."+gross+"\t\t"+"Net salary :Rs."+net);
		System.out.println("-------------------------------------------------------------");
	}
}
