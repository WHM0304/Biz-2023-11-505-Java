package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.util.Line;

public class NumbersH {
	
	public static void main(String[] args) {		
		int sum = 0;
		float avg = 0;
		NumberService numService = new NumberService();
		
		int num1 = numService.inputNum("첫번째 정수");
		int num2 = numService.inputNum("두번쨰 정수");
		int num3 = numService.inputNum("세번쨰 정수");
		sum = num1 + num2 + num3;
		avg = (float)sum / 3;
		Line.dLine(50);
		if(avg >=60) {
			System.out.printf("평균 %.2f 점입니다\n",avg);
			System.out.println("합격입니다");
			
		} else {
			System.out.printf("평균 %.2f 점입니다\n",avg);
			System.out.println("낙제입니다");
		}
		
		
	}
	

}
