package com.example.domain;

public class ParameterPassing {

	public static void main(String[] args) {
//		AccessExample ejemplo = new AccessExample();
//		System.out.println(ejemplo.numero1);
//		System.out.println(ejemplo.numero2);
//		System.out.println(ejemplo.numero3);
//		
//		modify(ejemplo);
//		
//		System.out.println(ejemplo.numero1);
//		System.out.println(ejemplo.numero2);
//		System.out.println(ejemplo.numero3);
//		
//		int ejemplo2 = 0;
//		System.out.println(ejemplo2);
//		modify2(ejemplo2);
//		System.out.println(ejemplo2);
		
		int result = sum(1,2,3,4,5,6,6,7,8,9);
		System.out.println(result);
	}
	
	public static void modify(AccessExample obj) {
		obj.numero1 = 9999;
		obj.numero2 = 8888;
		obj.numero3 = 7777;
	}
	
	public static void modify2(int obj) {
		obj = 999;
	}
	
	public static int sum(int ... nums) {
		int sum = 0;
//		for(int i = 0; i < nums.length; i++) {
//			sum+= nums[i];
//		}
		for(int num : nums) {
			sum += num;
		}
		return sum;
	}
	
	public static int sum2(String msj, boolean cond, Object ... nums) {
		return 0;
	}
}
