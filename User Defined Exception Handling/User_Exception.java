import java.io.*;
class myException extends Exception{
	myException(){
		System.out.println("Error:Password too short");
	}
	myException(int n){
		System.out.println("Error:Only adults can join");
	}
}
public class User_Exception{
	public static void main(String[] args)throws IOException,myException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter user name : ");
			String n = br.readLine();
			System.out.println("Enter your password : ");
			String m = br.readLine();
			if(m.length()<6)
				throw new myException();
			System.out.println("Enter your age : ");
			int age = Integer.parseInt(br.readLine());
			if(age<18)
				throw new myException(age);
		}
		catch(Exception e){}
	}
}
