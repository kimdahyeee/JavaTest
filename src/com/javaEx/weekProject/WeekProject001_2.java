package com.lgcns.weekProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeekProject001_2 {

	public static void main(String[] args) {

		int input;
		int total = 0;
		
		System.out.print("수를 입력하세요 : ");
		input = inputValue();
		
		for(int i=1; i<=input; i++){
			if(input % i == 0){
				total += i;
			}
		}
		
		System.out.println("약수들의 총 합 : " + total);
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
