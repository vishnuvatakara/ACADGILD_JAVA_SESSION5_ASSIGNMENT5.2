import java.util.Scanner;

abstract class Figure //abstract class
{
	double dim1;
	abstract public void findArea(); //abstract methods
	abstract public void findPerimeter(); //abstract methods
	abstract public void get(); //abstract methods
}
class Circle extends Figure
{	double r;
Scanner sc=new Scanner(System.in);
	//..........overriding abstract methods
	public void get() {
		System.out.println("enter the radious of the circle");
		r=sc.nextDouble();
	}
	//..........overriding abstract methods
	public void findArea() {
		
		double area=3.14*r*r;
		System.out.printf("\narea of circle is :"+area);
		
	}
	//..........overriding abstract methods
	public void findPerimeter()
	{
		
		double per=2*3.14*r;
		System.out.printf("\nperimeter of circle is :"+per);
	}
	
}
class Rectangle extends Figure
{	Scanner sc=new Scanner(System.in);
	double x,y;
	//..........overriding abstract methods
	public void get()
	{
		System.out.println("\nenter the length and breadh of rectangle");
				x=sc.nextDouble();
				y=sc.nextDouble();
	}
	//..........overriding abstract methods
	public void findArea() {
		double area=x*y;
		System.out.printf("\narea of recatngle is :"+area);
		
	}
	//..........overriding abstract methods
	public void findPerimeter()
	{
		double per=2*(x+y);
		System.out.printf("\nperimeter of recatngle is :"+per);
	}
	
}
class Traingle extends Figure
{	double b,h,i,j;
	Scanner sc=new Scanner(System.in);
	//..........overriding abstract methods
	public void get() {
		System.out.println("\nenter the base and heigth of taringle");
		b=sc.nextDouble();
		h=sc.nextDouble();
		System.out.println("\nenter the other two side of traingle");
		i=sc.nextDouble();
		j=sc.nextDouble();
	}
	public void findArea() {
		double area=.5*(b*h);
		System.out.printf("\narea of traingle is :"+area);
	}
	public void findPerimeter()
	{
		double per=i+j+b;
		System.out.println("\nperimeter of traingle is :"+per);
	}
	
}
public class Show {
public static void main(String args[])
{	System.out.println("enter the details all the dimension are in cm");
	Circle obj1=new Circle();
	obj1.get();
	Rectangle obj2=new Rectangle();
	obj2.get();
	Traingle obj3=new Traingle();
	obj3.get();
	obj1.findArea();
	obj1.findPerimeter();
	obj2.findArea();obj2.findPerimeter();
	obj3.findArea();
	obj3.findPerimeter();
	
	
	
}

}
