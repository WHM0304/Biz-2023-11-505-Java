package com.callor.hello.var;

public class VarF {
	public static void main(String[] args) {
		
		//변수설정
		float scoreKor = 0;
		float scoreEng = 0;
		float scoreMath = 0;
		
		float total = 0;
		float avg = 0;
		
		//변수 값 할당
		scoreKor = 80.2f;
		scoreEng = 70.3f;
		scoreMath = 80.3f;
		
		total = scoreKor + scoreEng + scoreMath;
		avg = total / 3;
		
		// 출력
		
		System.out.println("=======================");
		System.out.println("국어 : " + scoreKor);
		System.out.println("영어 : " + scoreEng);
		System.out.println("수학 : " + scoreMath);
		System.out.println("------------------------");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("=======================");
		
		
		
		
		
	}

}
