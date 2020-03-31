package com.example.domain;

public class StudentTester {
	public static void main(String[] args) {
//		Student s1 = new Student();
//		s1.setStudentId(456);
//		s1.setName("Anna");
//		s1.setSsn("DEF456");
//		s1.setGpa(4.0);
//		System.out.println(s1);
//		
//		Student s2 = new Student(123, "John Smith", "ABC123", 10);
//		System.out.println(s2);
		other();
		System.out.println("----");
		other2();
	}
	
	public static void other() {
		double x = 3.25;
		double y = -4.5;
		int m = 23;
		int n = 9;
		System.out.println(x + m * y - (y + n) * x);
		System.out.println(m / n + m % n);
		System.out.println(5 * x - n / 5);
		System.out.println(Math.sqrt(Math.sqrt(n)));
		System.out.println((int) x);
		System.out.println(Math.round(y));
		
	}
	
	public static void other2() {
		double x = 3.25;
		double y = -4.5;
		int m = 23;
		int n = 9;
		System.out.println((int) Math.round(x) + (int) Math.round(y));
		System.out.println(m + n);
		System.out.println(1 - 1 - ((1 - (1 - (1 - n)))));
	}
}
