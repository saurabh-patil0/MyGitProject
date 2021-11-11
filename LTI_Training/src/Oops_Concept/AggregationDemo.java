package Oops_Concept;

import java.util.ArrayList;
import java.util.List;

// Department has many students
class Student
{
	String name;
	int id ;
	String dept;
	
	Student(String name, int id, String dept)
	{
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
}

class Department
{
	String deptName;
	List<Student> students;
	
	Department(String name, List<Student> students)
	{
		deptName = name;
		this.students = students;
	}
	
	public List<Student> getStudents() 
	{
		return students;
	}
}
public class AggregationDemo 
{
	public static void main(String args[]) 
	{
	Student studentOne = new Student("swetha",1, "IT");
	Student studentTwo = new Student("mamatha", 2, "HR");
	Student studentThree = new Student("bela", 3, "Accounts");
	
	List<Student> student_dept = new ArrayList<Student>();
	student_dept.add(studentOne);
	student_dept.add(studentTwo);
	student_dept.add(studentThree);
	
	Department dept = new Department("Common_Depratment", student_dept);
	}

}
