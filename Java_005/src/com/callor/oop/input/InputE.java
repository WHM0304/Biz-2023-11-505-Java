package com.callor.oop.input;

import java.util.Scanner;

public class InputE {

	public static boolean operator2() {
		int nums[] = new int[3];
		Scanner scan = new Scanner(System.in);
		int index = 0;

		while (true) {

			System.out.print("정수(QUIT : 끝내기) >> ");
			String str1 = scan.nextLine();			
			if (str1.equals("QUIT")) {
				return false;
			}

			try {
				nums[index] = Integer.valueOf(str1);

			} catch (Exception e) {
//			e.printStackTrace();
				System.out.println("정수값을 정확히 입력해야 합니다");
				continue;
			}
			
			break;
		}
		index++;
		while (true) {

			System.out.print("정수(QUIT : 끝내기) 1 >> ");
			String str2 = scan.nextLine();
			System.out.println(str2 == "QUIT");
			if (str2.equals("QUIT")) {
				return false;
			}

			try {
				nums[index] = Integer.valueOf(str2);

			} catch (Exception e) {
//			e.printStackTrace();
				System.out.println("정수값을 정확히 입력해야 합니다");
				continue;
			}
			
			break;
		}
		index++;
		while (true) {

			System.out.print("정수(QUIT : 끝내기) 1 >> ");
			String str3 = scan.nextLine();
			System.out.println(str3 == "QUIT");
			if (str3.equals("QUIT")) {
				return false;
			}

			try {
				nums[index] = Integer.valueOf(str3);

			} catch (Exception e) {
//			e.printStackTrace();
				System.out.println("정수값을 정확히 입력해야 합니다");
				continue;
			}
			
			break;
		}
		index = 0;
		System.out.println("=".repeat(20));
		System.out.printf("%d\n", nums[index++]);
		System.out.printf("%d\n", nums[index++]);
		System.out.printf("%d\n", nums[index]);
		System.out.println("=".repeat(20));
		return true;

	}

	public static void main(String[] args) {

		boolean isExit = true;
		while (isExit) {
			// operator() 함수는 boolean type 의 값을 return 한다
			isExit = operator2();
		}
		System.out.println("종료 ~~ 종료임!!");

	}
}
