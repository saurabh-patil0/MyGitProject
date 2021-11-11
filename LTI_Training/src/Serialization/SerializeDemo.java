package Serialization;

import java.io.*;

public class SerializeDemo 
{

	public static void main(String [] args) throws Exception 
	{
	    Employee emp = new Employee();
	    emp.name = "Arti";
	    emp.address = "Satara";
	    emp.number = 1;
	    emp.SSN = 112233;
	      
	    FileOutputStream fi = new FileOutputStream("");
	    ObjectOutputStream out = new ObjectOutputStream(fi);
	    out.writeObject(emp);
	    System.out.println("I wrote the emp object to the file");
	      
	}
}