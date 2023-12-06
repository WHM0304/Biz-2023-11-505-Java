package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;

public class NumbersE {
	
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		int index = 1;
		
		for(int i = 2 ; i < 10; i++) {
			
			for(int j = 1 ; j < 10 ; j++) {
				
				if((i * index) % 2 == 0) {
					System.out.printf("%d X %d = %d\n",i,index,i*index);
			}
				
				
			}
			index++;
		}
		
		
		
	}

}
