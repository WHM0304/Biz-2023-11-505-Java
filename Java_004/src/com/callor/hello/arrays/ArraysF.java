package com.callor.hello.arrays;

public class ArraysF {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int sumKors = 0;
		int sumEngs = 0;
		int sumMaths = 0;
		int avgKors = 0;
		int avgEngs = 0;
		int avgMaths = 0;
		int sum = 0;
		float avg = 0;
		int scoreKors[] = new int[STUDENT_LENGTH];
		int scoreEngs[] = new int[STUDENT_LENGTH];
		int scoreMaths[] = new int[STUDENT_LENGTH];
		int sums[] = new int[STUDENT_LENGTH];
		float avgs[] = new float[STUDENT_LENGTH];
		
		for(int i = 0; i < scoreKors.length; i++) {
			scoreKors[i] = (int)(Math.random() * 50) + 51;
		}
		for(int i = 0; i < scoreEngs.length; i++) {
			scoreEngs[i] = (int)(Math.random() * 50) + 51;
		}
		for(int i = 0; i < scoreMaths.length; i++) {
			scoreMaths[i] = (int)(Math.random() * 50) + 51;
		}
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			sums[i] = scoreKors[i];
			sums[i] += scoreEngs[i];
			sums[i] += scoreMaths[i];
		}
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			avgs[i] = (float)sums[i] /3 ;
		}
		System.out.printf("=".repeat(50));
		System.out.println("샛별반 성적표");
		System.out.println("-".repeat(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("-".repeat(50));
		for(int i = 0; i <STUDENT_LENGTH; i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\n" , i+1 , scoreKors[i] , scoreEngs[i],scoreMaths[i] , sums[i], avgs[i]);
		}
		System.out.println("-".repeat(50));
		for(int i = 0 ; i <STUDENT_LENGTH ; i++) {
			sums[i] += scoreKors[i];			
			sumKors = sums[i];
			
		}
		System.out.printf("\t%d",sumKors);
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			sums[i] += scoreEngs[i];
			sumEngs = sums[i];
		}
		System.out.printf("\t%d",sumEngs);
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			sums[i] += scoreMaths[i];
			sumMaths = sums[i];
		}
		System.out.printf("\t%d",sumMaths);
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			sums[i] = scoreEngs[i];
			sums[i]	+= scoreKors[i];
			sums[i] += scoreMaths[i];
			sum += sums[i];
		}
		avgKors = sumKors /STUDENT_LENGTH;
		avgEngs = sumEngs /STUDENT_LENGTH;
		avgMaths = sumMaths /STUDENT_LENGTH;
		System.out.printf("\t%d\n",sum);
		System.out.printf("\t%d\t%d\t%d\n",avgKors,avgEngs,avgMaths);
		System.out.println("=".repeat(50));

	}

}
