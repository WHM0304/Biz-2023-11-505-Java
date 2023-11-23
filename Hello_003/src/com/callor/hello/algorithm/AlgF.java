package com.callor.hello.algorithm;

public class AlgF {
	public static void main(String[] args) {
		
		int pay = 3587960;
		
		/*
		 * 우리나라 화폐는
		 * 5만, 1만, 5천, 1천, 5백, 1백, 50, 10원 단위이다
		 * 아래 pay에 저장된 값에서 
		 * 각각 화폐단위만큼 몇개씩이 포함되는지 
		 * 출력하시오
		 */
		
 
		System.out.println("5만원권 : " + pay / 50000 + "매");
		pay = pay % 50000;
		System.out.println("1만원권 : " + pay / 10000 + "매" );
		pay = pay % 10000;
		System.out.println("5천원권 : " + pay / 5000 + "매");
		pay = pay % 5000;
		System.out.println("1천원권 : " + pay / 1000 + "매");
		pay = pay % 1000;
		System.out.println("500원권 : " + pay / 500 + "매");
		pay = pay % 500;
		System.out.println("100원권 : " + pay / 100 + "매");
		pay = pay % 100;
		System.out.println("50원권 : " + pay / 50 + "매");
		pay = pay % 50;
		System.out.println("10원권 : " + pay / 10 + "매");
		pay = pay % 10;
		
		
		
		
		
		
		
	}

}
