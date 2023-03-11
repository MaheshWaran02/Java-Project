package oops;

public class Insurans extends Citizen {
	public int insuransID;

	public Insurans() {

		System.out.println("Insite Default Con of Insurans");
	}

	public void Print() {
		
		super.print();
		System.out.println("Insurans Id is " + insuransID);
	}

	public void Print(String message) {

		System.out.println("Typing some message " + message);

	}
}
