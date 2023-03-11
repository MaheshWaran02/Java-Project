package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stri1 = "hello my world";

		String result = "";

		for (int i = stri1.length() - 1; i >= 0; i--) {
			result = result + stri1.charAt(i);

		}
		System.out.println("revers string " + result);
		
		
		//palindrom mean if we reverse they word output word will same
		
		
		if (stri1.equalsIgnoreCase(result)) {

			System.out.println("The given string is palindrom");

		} else {

			System.out.println("The given string is not palindrom");
		}

String str2 = "David meets John and Lily";
		
		String[] arr = str2.split(" ");
		
		String result1= "";
		
		for(int i=arr.length-1;i>=0;i--) {
			
			result1= result1+arr[i]+ " ";
		}
		
		System.out.println("The result is " + result1.trim());
		
	}

}
