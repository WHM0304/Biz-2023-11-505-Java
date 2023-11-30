package com.callor.oop.input;

import java.util.Scanner;

public class InputF {
	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);
		

		while (true) {

			System.out.println("정수 >> ");
			String str = scan.nextLine();
			if (str.equalsIgnoreCase("QUIT")) {
				System.out.println("종료");
				break;
			}

			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해 주세요");
				continue;
			}
			if (num % 2 == 0) {
				if (num > 1 && num < 11) {
					System.out.printf("%d 는 짝수 입니다.\n", num);
				} else {
					System.out.println("2 이상 10이하 중 짝수를 입력해주세요");
				}
			} else {
				System.out.println("2 이상 10이하 중 짝수를 입력해주세요");
			}
		}

	}

}
