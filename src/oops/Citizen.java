package oops;

public class Citizen extends Person {

	public int SSN;

	public Citizen() {

		System.out.println("inside default cons");
	}

	public Citizen(String Name, String CountryName, int age, int SSN) {
		System.out.println("Inside param cons of cizien");

		this.Name = Name;
		this.ContryName = CountryName;
		this.age = age;
		this.SSN = SSN;
	}

	public void print() {

		System.out.println("SSN is " + SSN);
	}

}
