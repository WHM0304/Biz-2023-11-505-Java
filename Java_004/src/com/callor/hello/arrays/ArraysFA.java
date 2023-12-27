package com.callor.hello.arrays;

public class ArraysFA {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int SUBJECT_COUNT = 3;
		
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEngs = new int[STUDENT_LENGTH];
		int[] scoreMaths = new int[STUDENT_LENGTH];
		
		int[] sums = new int[STUDENT_LENGTH];
		float[] avgs = new float[STUDENT_LENGTH];
		
		int[] totalSum = new int[SUBJECT_COUNT];
		float[] totalAvg = new float[SUBJECT_COUNT];
		
		for(int i = 0 ; i < scoreKors.length; i++) {
			scoreKors[i] = (int)(Math.random() * 50) + 51;
		}
		for(int i = 0 ; i < scoreEngs.length; i++) {
			scoreEngs[i] = (int)(Math.random() * 50) + 51;
		}
		for(int i = 0 ; i < scoreMaths.length; i++) {
			scoreMaths[i] = (int)(Math.random() * 50) + 51;
		}
		for(int i = 0; i <STUDENT_LENGTH ; i++) {
			sums[i] = scoreKors[i];
			sums[i] += scoreEngs[i];
			sums[i] += scoreMaths[i];
		}

		for(int i = 0; i <STUDENT_LENGTH ; i++) {
			avgs[i] = (float)sums[i] / SUBJECT_COUNT;
			
		}
		// 과목별 총점
		for(int i = 0 ; i < STUDENT_LENGTH ; i++) {
			totalSum[0] += scoreKors[i];
			totalSum[1] += scoreEngs[i];
			totalSum[2] += scoreMaths[i];
		}
		// 과목별 평균
		for(int i = 0; i < SUBJECT_COUNT ; i++) {
			totalAvg[i] =(float)totalSum[i] /STUDENT_LENGTH;
		}
//		totalAvg[0] =(float)totalSum[0] /STUDENT_LENGTH;
//		totalAvg[1] =(float)totalSum[1] /STUDENT_LENGTH;
//		totalAvg[2] =(float)totalSum[2] /STUDENT_LENGTH;
		
		System.out.println("=".repeat(80));
		System.out.println(" 샛별반 성적표");
		System.out.println("-".repeat(80));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		for(int i = 0 ; i < STUDENT_LENGTH ; i++) {
			System.out.printf("%2d\t",i+1);
			System.out.printf("%4d\t" , scoreEngs[i]);
			System.out.printf("%4d\t" , scoreKors[i]);
			System.out.printf("%4d\t" , scoreMaths[i]);
			System.out.printf("%5d\t" , sums[i]);
			System.out.printf("%5.2f\n" , avgs[i]);
		}
		System.out.println("-".repeat(80));
		System.out.print("총점\t");
		int totalOfTotalSum = 0;
		// 과목 총점 출력하면서 총점의 총점 계산
		for(int i = 0 ; i < SUBJECT_COUNT ; i++) {
			System.out.printf("%4d\t" , totalSum[i]);
			totalOfTotalSum += totalSum[i];
		}
		// 총점의 총점 출력
		System.out.printf("%5d\n",totalOfTotalSum);
		System.out.print("평균\t");
		float avgOfTotalAvg = 0;
		// 평균 출력하면서 평균의 평균 계산
		for(int i = 0 ; i < SUBJECT_COUNT ; i++) {
			System.out.printf("%4.0f\t" , totalAvg[i]);
			avgOfTotalAvg += totalAvg[i];
		}
		
		avgOfTotalAvg /= SUBJECT_COUNT;
		System.out.printf("\t%5.2f\n",avgOfTotalAvg);
		System.out.println();
		System.out.println("=".repeat(80));
		
		
		
		
	}

}
