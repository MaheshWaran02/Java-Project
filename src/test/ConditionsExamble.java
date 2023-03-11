package test;

import java.util.Scanner;

public class ConditionsExamble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner scanner = new Scanner(System.in);
			System.out.println("enter our age: ");
		age = scanner.nextInt();
		
		
		if(age>17 || age<80) {
		System.out.println("your not eligiable for voting");
	}
		else if (age == 17)
		{
			System.out.println("your eligible for next year");
		}
		else {
			System.out.println("your eligible for vote");
		}
		scanner.close();
	}

}

