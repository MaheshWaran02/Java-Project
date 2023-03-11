package oops;

public class Employee {
	public String Name;
	public int EmpID;
	private static int Salary = 50000;
	
	
	public Employee() {
		System.out.println("Insite Default Cons");
	}
    public Employee(String var1, int var2)
    {
    	System.out.println("Insite parameter cons");
    	
    	Name  = var1;
    	EmpID = var2;
    	
    }
	public void DisplayName() {

		System.out.println("name of the employee is " + Name);

	}
	
	public static void Displaysalary()  {
		System.out.println("Salay is all the employee is " + Salary);
	}

}
