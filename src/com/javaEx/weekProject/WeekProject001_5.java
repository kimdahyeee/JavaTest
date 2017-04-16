package com.lgcns.weekProject;

public class WeekProject001_5 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i =3; i<1000; i++){
			if( i % 3 == 0 && i % 5 == 0){
				sum += i;
			}else if(i % 3 == 0){
				sum += i;
			}else if(i % 5 == 0){
				sum += i;
			}
		}
		
		System.out.println("1000 미만의 자연수에서 3, 5의 배수의 총 합 : " + sum);
	}

}
