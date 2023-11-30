package com.callor.hello.algorithm;

public class AlgA {
	public static void main(String[] args) {
		
		/*
		 * 1~ 100까지 숫자중의 3의 배수의 합
		 */
		
		
		int sum = 0;
		
		for(int i = 0; i < 100; i++) {
			int num = i + 1;
			if((num) % 3 == 0) {
				// num 의 값이3의 배수인경우만
				// 실행되는 코드
				sum += num;
				
				
			}
			
		}
		System.out.printf("3의배수 의 누적합 : ");
		System.out.println(sum);
		
		
	}
	
}