package com.example.domain;

public class StringPractice {

	public static void main(String[] args) {
//		String s1 = "This is a ";
//		String s2 = "string";
//		String s3 = s1 +s2;
//		String s4 = "This is a " + s2;
//		s1 += s2;
//		
//		System.out.println("s1: "+s1);
//		System.out.println("s2: "+s2);
//		System.out.println("s3: "+s3);
//		System.out.println("s4: "+s4);
//		String s1 = "This is a String.";
//		String s2 = new String("This is a String.");
//		String s5 = new String("This is a String.");
//		String s3 = "String.";
//		String s4 = "This is a " + s3;
//		
//		System.out.println(s1 == s2);
//		System.out.println(s1 == s4);
//		System.out.println(s2 == s5);
		email("johnsmit1@gmail.com");
		
		int c = 0;
		int x;
		if(c > 9) {
			x = 6;
		}
		else {
			x = 7;
		}
		
		int y = c > 9 ? 6 : 9;
	}
	
	public static void email(String email) {
		String domain = "";
		int position = email.indexOf('@');
		domain = email.substring(position + 1);
		System.out.println(domain);
	}
}
