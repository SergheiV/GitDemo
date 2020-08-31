package coreJava;

public class reversedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "madam";
		String t= "";
		for (int i=s.length()-1;i>=0;i--) 
		{
			t= t+s.charAt(i);	
		}
		System.out.println(t);
		System.out.println(s);	
		
		
		if (t==s)
		{
			System.out.println("it is a palindrom");
		}
		else 
		{
			System.out.println("it is not a palindrom");
		}

		String message = new String("hello from the other side"); 
		message.toUpperCase();
	}

}
