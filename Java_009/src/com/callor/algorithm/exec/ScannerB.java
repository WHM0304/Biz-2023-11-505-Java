package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.util.Line;

public class ScannerB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		Line.dLine(50);
		while (true) {

			System.out.print("첫번째 정수를 입력하세요 >> ");
			String str = scan.nextLine();

			try {
				num1 = Integer.valueOf(str);
				break;
			} catch (Exception e) {
				System.out.println("**정수를 정확히 입력하여 주세요**");

			}
		}
		while (true) {
			System.out.print("두번째 정수를 입력하세요 >> ");
			String str2 = scan.nextLine();
			try {
				num2 = Integer.valueOf(str2);
				break;
			} catch (Exception e) {
				System.out.println("**정수를 정확히 입력하여 주세요**");
			}
		}
		Line.sLine(50);
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d ÷ %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2);
		Line.dLine(50);

	}

}
