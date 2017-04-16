package com.lgcns.weekProject;

public class WeekProject001_1 {

	public static void main(String[] args) {

		long num1 =1l;
		long num2 = 1l;
		long num3 = 0;
		
		for(int i=1; i<=48; i++){
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
		
		System.out.println("50 번째 피보나치 수열의 수 : " + num3);
	}

}
