package com.callor.hello.algorithm;

public class LoopK {
	public static void main(String[] args) {
		int sum = 0;
		int range = 0;
		range = 37;
		for(int i = 0; i < range ; i++  ) {
			
			sum += i;
			
			
		}
		System.out.println("======================");
		System.out.printf("1 ~ %d 덧셈결과 : ", range );
		System.out.println(sum);
		System.out.println("======================");
	}

}
