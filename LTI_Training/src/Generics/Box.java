package Generics;

// Generic class example

public class Box<T, E> 
{
	T area;
	E Boxname;
	
	public void setArea(T area) 
	{
		this.area = area;	
	}
	
	public T getArea() 
	{
		return area;
	}
	
	public E getBoxName() 
	{
		return Boxname;
	}
	
	public static void main(String args[]) 
	{
		Box<Integer, String> boxObj = new Box<Integer, String>();
		boxObj.setArea(100);
		boxObj.Boxname = "OpenBox";
		System.out.println(boxObj.getBoxName());
		System.out.println(boxObj.getArea());
	}
	   
}