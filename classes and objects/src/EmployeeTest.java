import java.util.Scanner;
class Employee{
	String fname,lname,dep,city;
	double sal;
	Employee()
	{
		sal=100000;
		fname="gagan";
		lname="chauhan";
		city="gurgaon"
		dep="cse"
	}
	Employee(String fname,String lname,double sal, String city, String dep)
	{
		this.fname=fname;
		this.lname=lname;
		this.sal=sal;
		this.city=city;
		this.dep=dep;
	}
	void displayDetails()
	{
		System.out.println("First name "+fname+" Last name "+lname+" salary "+sal);
	}
	
	}

class EmployeeTest{
	public static void main(String[] args) {
		 Employee e=new Employee();
        e.displayDetails();
		

		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name of the employee");
		String fn=sc.next();
		System.out.println("enter last name of the employee");
		String ln=sc.next();
		System.out.println("enter salary of the employee");
		System.out.println("enter city");
		System.out.println("enter department");
	    }

}