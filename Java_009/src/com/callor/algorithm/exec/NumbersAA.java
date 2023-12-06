package com.callor.algorithm.exec;

import com.callor.algorithm.util.Line;

public class NumbersAA {
	
	public static void main(String[] args) {
		for(int i = 0; i <10 ; i ++) {
			System.out.printf("%d\t",i+1);						
		}
		System.out.println();
		Line.dLine(50);
		int num = 0;
		while(num <10) {
			System.out.printf("%d\t",num+1);
			num++;
		}
		System.out.println();
		Line.dLine(50);
		num = 0;
		while(true) {
			System.out.printf("%d\t",num +1);
			num++;
			if(num >= 10) {
				break;
			}
			
		}
		
		System.out.println();
		Line.dLine(50);
		num = 0;
		while(num < 10) {
			System.out.printf("%d\t", num++ + 1);
									
		}
		
	}

}
