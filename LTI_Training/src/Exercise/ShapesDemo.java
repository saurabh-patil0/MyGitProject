package Exercise;
abstract class Shape
{
	String shapeName;
	
	abstract double area();
	
	public Shape(String name) 
	{
		// TODO Auto-generated constructor stub
		this.shapeName = name;
	}
	
	public String toString() 
	{
		return shapeName;
	}
	
	public double computePower(double base, double power) 
	{
		return Math.pow(base, power);
	}
}

class Rectangle extends Shape
{

	double length;
	double width;
	
	Rectangle(double length, double width)
	{
		super("Rectangle");
		this.length = length;
		this.width = width;
	}
	@Override
	double area() 
	{
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle is:" + (length*width));
		return (length*width);
		
	}
	public String toString() 
	{
		return super.toString() + " of length " + length;
	}
	
}

class Sphere extends Shape{
	
	double radius;
	double PI = 3.14;
	
	public Sphere(double radius) 
	{
		super("Sphere");
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	@Override
	double area() 
	{
		// TODO Auto-generated method stub
		double sphereArea = 4*PI*computePower(radius, 2);
		System.out.println("Area of sphere is:" + sphereArea);
		return sphereArea;
		
	}
	public String toString() 
	{
		return super.toString() + " of radius " + radius;
	}
	
}

class Cylinder extends Shape
{
	double radius_cylinder;
	double height;
	
	public Cylinder(double radius, double height) 
	{
		super("cylinder");
		// TODO Auto-generated constructor stub
		radius_cylinder = radius;
		this.height = height;
	}

	@Override
	double area() 
	{
		// TODO Auto-generated method stub
		double PI = 3.14;
		double cylinderArea = PI*computePower(radius_cylinder,2)*height;
		System.out.println("Area of cylinder is:" + cylinderArea);
		return cylinderArea;
		
	}
	public String toString()
	{
		return super.toString() + " of radius " + radius_cylinder;
	}
	
}

class Paint
{
	double coverage;
	public double amount(Shape s)
	{
		return s.area()/coverage;
	}
	
	public Paint(double coverage) 
	{
		// TODO Auto-generated constructor stub
		this.coverage = coverage;
	}
}
public class ShapesDemo 
{
	public static void main(String[] args) 
	{
		Paint paint = new Paint(10);
		Rectangle deck = new Rectangle(20, 35);
		Sphere bigBall = new Sphere(15);
		Cylinder tank = new Cylinder(10, 30);
		double amountForRectangle = paint.amount(deck);
		double amntForSphere = paint.amount(bigBall);
		double amntForCylinder = paint.amount(tank);
		System.out.println("amount of paint for rectangle " 
		+ amountForRectangle);
		System.out.println("amount of paint for sphere " 
				+ amntForSphere);
		System.out.println("amount of paint for cylinder " 
				+ amntForCylinder);
		
	}

}