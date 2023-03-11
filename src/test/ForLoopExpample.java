package test;

public class ForLoopExpample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int num = 1; num < 11; num++) {

			System.out.println(num);
		}

		System.out.println("End of for loop");

		for (int num1 = 10; num1 > 0; num1--) {

			System.out.println(num1);

		}
		System.out.println("End of second for loop");

		for (int num3 = 10; num3 > 0; num3 -= 2) {

			System.out.println(num3);

		}
		System.out.println("End of third for loop");
		int[] arr1 = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("the value is " + arr1[i]);
		}
		// for each loop
		for (int val : arr1) {
			System.out.println("value is" + val);
		}
		String str1 = "Mahesh";
		for(int i=0;i<str1.length();i++)
		{
			
			System.out.println("chart value is " + str1.charAt(i));
		}
		
		
		
	}

}
