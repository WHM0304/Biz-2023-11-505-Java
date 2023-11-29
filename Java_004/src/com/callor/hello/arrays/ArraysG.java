package com.callor.hello.arrays;

public class ArraysG {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int SUBJECT_COUNT = 1;
		int sum = 0;
		int scoreKors[] = new int[STUDENT_LENGTH];
		float avgKors[] = new float[STUDENT_LENGTH];
		int sumKors[] = new int[STUDENT_LENGTH];

		for (int i = 0; i < STUDENT_LENGTH; i++) {
			scoreKors[i] = (int) (Math.random() * 50) + 51;
		}

		for (int i = 0; i < STUDENT_LENGTH; i++) {
			 sumKors[0] += scoreKors[i]; 	  
		}
		
		
		System.out.printf("%d", sumKors[0]);
	}

}
