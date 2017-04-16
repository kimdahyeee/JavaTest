package com.lgcns.weekProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeekProject001_10 {

	public static void main(String[] args) {

		System.out.print("입력(홀수만) : ");
		int input = inputValue();
		
		for(int i=0; i<=input/2; i++){
			for(int j=input/2; j>i; j--){
				System.out.print(" ");
			}
			for(int k = 1; k<=1+2*i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=input/2; i>0; i--){
			for(int j=input/2; j>=i; j--){
				System.out.print(" ");
			}
				
			for(int k = 1; k<2*i; k++){
				System.out.print("*");
			}
			System.out.println();
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
