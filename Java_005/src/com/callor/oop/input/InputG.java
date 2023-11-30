package com.callor.oop.input;

import java.util.Scanner;

public class InputG {

	public static boolean isPrime(int num) {
		int index = 0;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				break;
			}
		}
		if (index < num) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("정수(QUIT:종료) >>");
			String str = scan.nextLine();
			if (str.equalsIgnoreCase("QUIT")) {
				break;
			}
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해 주세요");
				System.out.println("입력한 값 : " + str);
				continue;
			}
			if (num > 1) {
				System.out.println("값은 2 이상을 입력해야 합니다");
				System.out.println("입력한 값 : " + num);
				continue;
			}
			if (isPrime(num)) {
				System.out.printf("%d 는 소수이다" , num);
				continue;
			}
		}

	}

}
