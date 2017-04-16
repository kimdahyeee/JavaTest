package com.lgcns.weekProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeekProject001_3 {

	public static void main(String[] args) {

		int input;
		System.out.print("수를 입력하세요 : ");
		input = inputValue();
		
		int i=1;
		while(i<=500){
			if(input %2 == 0){
				input /= 2;
			}else{
				input = input * 3 + 1;
			}
			
			if(input == 1){
				break;
			}
			if(i == 500){
				i = 1;
				break;
			}
			
			i++;
		}
		
		System.out.println(i + "번 만에 1이 되었습니다.");
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
