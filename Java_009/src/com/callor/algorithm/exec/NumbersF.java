package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;

public class NumbersF {

	public static void main(String[] args) {
		NumberService numService = new NumberService();
		
		int num = numService.inputNum("정수를");
		for(int i = 2; i < 10; i ++) {
			for(int j =1 ; j <10 ; j++ ) {
				if((j *i )% num== 0 ) {
				System.out.printf("%d X %d = %d\n",i , j , i*j );
				}
			}
		}
		
		
	}

}
