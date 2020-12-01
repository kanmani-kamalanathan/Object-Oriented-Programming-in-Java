import java.io.*;
abstract class Shape{
	int a=3,b=4;
	abstract public void print_area();
}
class Rectangle extends Shape{
	public int area_rect;
	public void print_area(){
		area_rect=a*b;
		System.out.println("The area of rectangle is: "+area_rect);
	}
}
class Triangle extends Shape{
	int area_tri;
	public void print_area(){
		area_tri=(int)(0.5*a*b);
		System.out.println("The area of triangle is: "+area_tri);
	}
}
class Circle extends Shape{
	int area_circle;
	public void print_area(){
		area_circle=(int)(3.14*a*a);
		System.out.println("The area of circle is: "+area_circle);
	}
}
public class AbstractDemo{
	public static void main(String[] args){
		Rectangle r = new Rectangle();
		r.print_area();
		Triangle t = new Triangle();
		t.print_area();
		Circle r1 = new Circle();
		r1.print_area();
	}
}
