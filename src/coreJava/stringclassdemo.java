package coreJava;

public class stringclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is a pre-build classes in java
		//1.String literal
		//2.by creating an object of string
		
		String a=" javatraining";
		System.out.println(a.charAt(2)); // show us the 2nd character 
		System.out.println(a.indexOf("e")); // where is an e in the string
		System.out.println(a.substring(3, 6)); // show string from 3rd letter until the 6th letter
		System.out.println(a.substring(5)); //show string from 5th letter starting with 0
		System.out.println(a.concat("Rahul teaches")); // combines the text in the string + new text
		System.out.println(a.length()); //shows the length of the string
		System.out.println(a.trim()); //removes spaces
		System.out.println(a.toUpperCase()); // show all in upper letter
		//System.out.println(a.split("/")); // split the string from "/"
		
		String arr[]=a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("t", "s"));
	}

}
