package com.callor.algorithm.exec;

import com.callor.algorithm.util.Line;

public class NumbersEA {
	
	public static void main(String[] args) {
		for(int dan = 2; dan <10 ; dan ++) {
			for(int item = 1; item < 10; item++) {
				if((dan * item) % 2 == 0) {
					
					System.out.printf("%d X %d = %d\n",dan,item ,dan * item);
				}
				
				
			}
			Line.sLine(50);
			
		}
		
		
		
		
	}

}
