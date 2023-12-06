package com.callor.algorithm.exec;

import java.util.Scanner;

public class ScannerAA {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 >> ");
		String str = scan.nextLine();
		int num1 = Integer.valueOf(str);
				
		System.out.print("두번째 정수 입력 >> ");
		str = scan.nextLine();
		int num2 = Integer.valueOf(str);
		
		System.out.printf("%d + %d = %d", num1 , num2 , num1 + num2);
		System.out.printf("%d - %d = %d", num1 , num2 , num1 - num2);
		System.out.printf("%d * %d = %d", num1 , num2 , num1 * num2);
		System.out.printf("%d ÷ %d = %d", num1 , num2 , num1 / num2);
		System.out.printf("%d MOD %d = %d", num1 , num2 , num1 % num2);
		
	}

}
