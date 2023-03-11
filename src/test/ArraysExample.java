package test;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {1, 2, 3, 4, 5, 6, 7};
		System.out.println("Length of the array is " + arr1.length);
		System.out.println("First value inside the array is " + arr1[0]);
		System.out.println("Last value inside the array is " + arr1[arr1.length-1]);
		
		String[] arr2 = {"Mon","Tue","Wed","Thu","Fri"};
		System.out.println("value of third postion " + arr2[2]);
String str = "Clean World Green World Happy World";
		
		String[] arr3 = str.split(" ");  // {"Clean","World","Green","World"}
		
		System.out.println(arr3);
		
		System.out.println("Total num of words inside the string is " + arr3.length);

	}


	}
