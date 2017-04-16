package com.lgcns.weekProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeekProject001_4 {

	public static void main(String[] args) {

		System.out.print("값을 입력하세요 : ");
		int input = inputValue();
		int count = 0;
		
		for(int i = 1; i<= input/2; i++){
			count += countSum(i, input);
		}
		
		System.out.println("총 "+ (count + 1) + "가지 존재합니다.");
	}
	
	public static int countSum(int start, int result){
		int sum = 0;
		while(sum <= result){
			sum += start;
			if(sum == result){
				return 1;
			}
			start++;
		}
		return 0;
	}
	
	public static int inputValue(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = 0;
		try {
			input = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return input;
	}

}
