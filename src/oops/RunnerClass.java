package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Employee emp1 = new Employee(); emp1.Name = "Mahesh"; emp1.EmpID = 3697;
		 * emp1.DisplayName();
		 * 
		 * Employee emp2 = new Employee(); emp2.Name = "Shanmugam"; emp1.EmpID = 8888;
		 * emp2.DisplayName();
		 * 
		 * Employee emp3 = new Employee("Manju",3696); emp3.DisplayName();
		 * 
		 * Employee.Displaysalary();
		 */
		
		System.out.println("***"
				+ ""
				+ ""
				+ "print ct1****");
		Citizen ct1 = new Citizen();
		ct1.age = 21;
		ct1.Name = "mahesh";
		ct1.SSN = 3697;
		ct1.ContryName = "India";
		ct1.print();
		
		
		System.out.println(""
				+ ""
				+ ""
				+ "***print ct2****");
		Citizen ct2 = new Citizen("Shanumuga", "India", 52, 6789);
		ct2.print();
        
		
		System.out.println("***"
				+ ""
				+ ""
				+ "print OBJ1****");
		Insurans obj1 = new Insurans();
		obj1.insuransID = 3000;
		obj1.SSN = 8965;
		obj1.Print();
		obj1.Print("Hello world");
		
		
		
		EncapulationExample emp = new EncapulationExample();
		
		emp.setSalary(89990);
		System.out.println("they salary is " + emp.getSalary());
		
		
		
		
		
		
		

	}

}
