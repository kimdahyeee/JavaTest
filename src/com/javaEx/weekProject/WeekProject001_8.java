package com.lgcns.weekProject;

public class WeekProject001_8 {

	public static void main(String[] args) {

		int totalCount = 0;
		int count;
		
		for(int i=2; i<=120; i++){
			count = 0;
			for(int j = i; j>=2; j--){
				if(i % 2 == 0){
					count++;
				}
			}
			
			if(count %2 != 0){
				totalCount ++;
			}
		}
		
		System.out.println("석방된 죄수는 " + totalCount + "명 이다.");
	}

}
