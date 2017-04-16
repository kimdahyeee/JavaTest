package com.lgcns.weekProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeekProject001_7 {

	public static void main(String[] args) {

		String result = "";
		int plusValue;
		
		System.out.print("숫자를 입력하세요 : ");
		int input = inputValue();
		
		while(input != 1){
			plusValue = input % 2;
			result = plusValue + result;
			input /= 2;
		}
		
		System.out.println(input + "의 2진수 는" + (1 + result));
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
