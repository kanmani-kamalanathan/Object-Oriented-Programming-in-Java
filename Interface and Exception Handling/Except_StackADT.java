import java.io.*;
import java.util.*;
interface MyInterface{
	int n=20;
	public void pop();
	public void push();
	public void display();
}
class Stack implements MyInterface{
	int arr[] = new int[n];
	int top=-1;
	public void push(){
		try{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter element:");
			int ele = Integer.parseInt(dis.readLine());
			arr[++top]=ele;
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public void pop(){
		int popper = arr[top];
		top--;
		System.out.println("popped element : "+popper);
	}
	public void display(){
		if(top<0){
			System.out.println("Stack is empty");
			return;
		}
		else{
			String str="";
			for(int i=0;i<=top;i++)
				str=str+" "+arr[i];
			System.out.println("Elements are : "+str);
		}
	}
}
public class Except_StackADT{
	public static void main(String[] args)throws IOException{
		DataInputStream dis = new DataInputStream(System.in);
		Stack stk = new Stack();
		int menu=0;
		do{
			System.out.println("1.Push \n2.Pop \n3.Display \n4.Exit\n");
			System.out.println("Enter your choice: ");
			menu=Integer.parseInt(dis.readLine());
			switch(menu){
				case 1:
					stk.push();
					break;
				case 2:
					stk.pop();
					break;
				case 3:
					stk.display();
					break;
				case 4:
					System.exit(0);
			}
		}while(menu<=4);
		System.out.println();
	}
}
