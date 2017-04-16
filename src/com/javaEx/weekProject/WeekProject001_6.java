package com.lgcns.weekProject;

public class WeekProject001_6 {

	public static void main(String[] args) {

		int count = 0;
		
		for(int i = 8; i<=10000; i++){
			for(int j = 0; j<String.valueOf(i).length(); j++){
				if(String.valueOf(i).charAt(j) == '8'){
					count++;
				}
			}
		}
		
		System.out.println("총 " + count + "개");
	}

}
