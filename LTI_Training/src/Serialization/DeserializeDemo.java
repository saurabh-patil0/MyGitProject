package Serialization;

import java.io.*;
public class DeserializeDemo 
{

   public static void main(String args[]) throws Exception 
   {
	   FileInputStream fi = new FileInputStream("/tmp/emp.ser");
	   ObjectInputStream oi = new ObjectInputStream(fi);
	   Employee emp = (Employee)oi.readObject();
	   System.out.println(emp.name);
	   System.out.println(emp.address);
	   System.out.println(emp.SSN);
	   System.out.println(emp.number);
	   
   }
}