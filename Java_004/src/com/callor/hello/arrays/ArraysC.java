package com.callor.hello.arrays;

public class ArraysC {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int scoreKors[] = new int[STUDENT_LENGTH];
		int sum = 0;
		float avg = 0;
		System.out.println("=".repeat(30));
		System.out.println("  샛별반 국어 점수");
		System.out.println("-".repeat(30));
		for (int i = 0; i < scoreKors.length; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndNum;
			
		}
		for (int i =0 ; i < scoreKors.length; i++) {
			System.out.printf("%3d 번 : %2d\n" , i + 1 , scoreKors[i]);
		}
		for (int i = 0; i < scoreKors.length; i++) {
			sum += scoreKors[i];
			
		}
		avg = (float) sum / STUDENT_LENGTH ;
		System.out.println("-".repeat(30));
		System.out.printf(" 총점 : %d, 평균 : %.2f\n" , sum , avg);
		System.out.println("=".repeat(30));

	}

}
