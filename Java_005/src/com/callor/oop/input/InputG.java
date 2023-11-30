package com.callor.oop.input;

import java.util.Scanner;

import com.callor.oop.utils.Line;

public class InputG {

	public static boolean noPrime(int num) {
		boolean noPrime = false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				noPrime = true;
				break;
			}
		}

		return noPrime;
	}

	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("정수(QUIT:종료) >>");
			String str = scan.nextLine();
			if (str.equalsIgnoreCase("QUIT")) {
				Line.sLine(50);
				System.out.println("종료");
				break;
			}
			try {
				num = Integer.valueOf(str);

			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해 주세요");
				System.out.println("입력한 값 : " + str);
				Line.dLine(50);
				continue;
			}
			if (num < 2) {

				System.out.println("입력한 값 : " + num);
				System.out.println("2이상 입력해주세요");
				Line.dLine(50);
				continue;
			}
			if (num % 2 == 0) {
				Line.dLine(50);
				System.out.println(num + " 는 짝수");
			} else {
				Line.dLine(50);
				System.out.println(num + " 는 짝수가 아님");
			}
			
			Line.dLine(50);
			if (noPrime(num)) {
				System.out.printf("%d 는 소수가 아닙니다.\n", num);
			} else {
				System.out.printf("%d 는 소수 입니다\n", num);
			}
			Line.dLine(50);

		}
		Line.dLine(50);

	}

}
