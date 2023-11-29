package com.callor.hello.arrays;

public class ArraysCA {

	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		
		for(int i = 0; i < scoreKors.length ; i++) {
			int rndScore = (int)(Math.random() * 50 ) + 51;
			scoreKors[i] =rndScore;			
		}
		int sum = 0;
		float avg =0;
		for(int i = 0; i < scoreKors.length; i++) {
			sum += scoreKors[i];
			
		}
		avg = (float)sum / scoreKors.length;
		
		System.err.println("=".repeat(50));
		System.err.println("샛별반 국어 점수");
		System.err.println("=".repeat(50));
		for(int i = 0 ; i <scoreKors.length ; i++) {
			System.err.printf(" %2d : %3d\n" , i + 1 , scoreKors[i]);
		}
		System.err.println("-".repeat(50));
		System.err.printf(" 총점 : %d , 평균 : %5.2f",sum ,avg);
		
	}

}
