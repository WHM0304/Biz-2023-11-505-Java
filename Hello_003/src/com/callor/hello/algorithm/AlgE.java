package com.callor.hello.algorithm;

public class AlgE {
	public static void main(String[] args) {
		
		/*
		 * 아래의 num1 변수에 저장된 숫자의 
		 * 10만 단위의 값이 얼마인지 출력하시오
		 */
		
		int num1 = 3587964;
		int num2 = 100000;
		int num3 = 10;
		num1 = num1 / num2;
		
		System.out.println("십만단위의 숫자는 " + num1 % num3);
		
		num1 = 3587964;
		num1 = num1 % 1000000;
		num1 = num1 / 100000;
		System.out.println(num1);
		
		
		
		
		
	}

}
