package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.util.Line;

public class NumbersDA {
	
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		int sum = 0;
		int count = 0;
		while(true) {
			int num = numService.inputNum("숫자를");
			sum+= num;
			count++;
			if(sum >= 1000) {
				break;
			}
			
		}
		System.out.printf("%d 번째 숫자 총합 : %d",count,sum);
		
	}

}
