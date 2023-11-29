package com.callor.hello.arrays;

public class ArraysB {
	public static void main(String[] args) {
		int arrayLength = 10;
		int scoreKors[] = new int[arrayLength] ;
		int sum = 0;
		double avg = 0;
		int index = 0;
		for( index = 0 ; index < scoreKors.length ; index++) {
			int ranNum = (int)(Math.random() * 50) +51;
			scoreKors[index] = ranNum;
			sum += ranNum;
			
		}
		avg = sum / index ;
		System.out.println("국어 점수 총점 : " + sum);
		System.out.printf("%.2f",avg);
		
	}

}
