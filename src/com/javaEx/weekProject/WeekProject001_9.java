package com.lgcns.weekProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeekProject001_9 {

	public static void main(String[] args) {

		int[] num = {0,0,0,0,0};
		int[] sort = {0,0,0,0,0};
		
		for(int i=0; i<5; i++){
			num[i] = inputValue();
		}
		int max;
		for(int i=0; i<4; i++){
			for(int j=i+1; j<5; j++){
				
			}
		}
		
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
