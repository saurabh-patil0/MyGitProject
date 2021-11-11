package String_Handling;

class employee_demo
{
	int empid;
	String ename;
	
	employee_demo(int empid, String ename)
	{  
		 this.empid=empid;  
		 this.ename=ename;  
	} 
	
	public String toString() 
	{
		return empid + " " +ename;
	}

}


public class StringDemo 
{
	
	public static void main(String args[]) 
	{
		employee_demo e = new employee_demo(10, "viji");
		System.out.println(e.toString());
		//char array - String
		char[] myFirstString = {'h','e','l','l','o'};
		String helloString = new String(myFirstString);
		System.out.println(helloString);
		String s = "java";
		
		//length of a string
		System.out.println("length of string java is:" + s.length());
		
		//String Modification
		
		//String concatenation
		String s1 = "java";
	    String s2 = "training";
	    System.out.println(s1+ " " + s2);
		int num = 10;
		System.out.println(s1+ " " + num);
		
		// extraction - getting substring
		// String substring(int startIndex, int endIndex)
		String str = "Java Training";
		System.out.println(str.substring(0, 4));
		
		//Replace - string.replace(char original, char replace)
		String s3 = "I like automation testing";
		System.out.println(s1.replace('I', 'U'));
		System.out.println(s1.replace("like", "love"));
		
		//Trim
		String s4= " hello world ";
		System.out.println(s1);
		System.out.println(s1.trim());
		
		//Case conversion
		String s5 = "I want to learn java";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//string comparison
		//equals and equalsIngnoreCase
		String s6 = "Hello";
		String s7 = "hello";
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//compareTo = 0, equals <0 , >0
		
		String s8 = "Java";
        String s9 = "Java";
        String s10 = "Learn";
       
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s3.compareTo(s1));
		
		//startsWith(), endsWith()
		String s11 = "Learn Java";
		System.out.println(s1.startsWith("Learn"));
		System.out.println(s1.endsWith("Java"));
		
	}

}