package com.callor.hello.arrays;

public class ArraysA {
	
	
	public static void main(String[] args) {
		int num = (int)(Math.random() * 50 ) + 5 ;
		int sum = 0;
		int index = 1;
		System.out.printf("%d 번째 값 : " + num , index++);
		System.out.println();
		sum += num;
		num = (int)(Math.random() * 50 ) + 5 ;
		System.out.printf("%d 번째 값 : " + num , index++);
		System.out.println();
		sum += num;
		num = (int)(Math.random() * 50 ) + 5 ;
		System.out.printf("%d 번째 값 : " + num , index++);
		System.out.println();
		sum += num;
		num = (int)(Math.random() * 50 ) + 5 ;
		System.out.printf("%d 번째 값 : " + num , index++);
		System.out.println();
		sum += num;
		num = (int)(Math.random() * 50 ) + 5 ;
		System.out.printf("%d 번째 값 : " + num , index++);
		System.out.println();
		sum += num;
		System.out.println(sum);
		
	}

}
