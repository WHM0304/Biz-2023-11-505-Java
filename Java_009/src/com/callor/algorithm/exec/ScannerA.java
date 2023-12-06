package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.util.Line;

public class ScannerA {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		Line.dLine(50);
		System.out.print("첫번째 정수를 입력하세요 >> ");
		String str1 = scan.nextLine();
		num1 = Integer.valueOf(str1);
		System.out.print("두번째 정수를 입력하세요 >> ");
		String str2 = scan.nextLine();
		num2 = Integer.valueOf(str2);
		Line.sLine(50);
		System.out.printf("%d + %d = %d\n",num1,num2,num1+num2 );
		System.out.printf("%d - %d = %d\n",num1,num2,num1-num2 );
		System.out.printf("%d X %d = %d\n",num1,num2,num1*num2 );
		System.out.printf("%d ÷ %d = %d\n",num1,num2,num1/num2 );
		System.out.printf("%d MOD %d = %d\n",num1,num2,num1% num2 );
		Line.dLine(50);
		
	}

}
