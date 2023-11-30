package com.callor.oop.input;

import java.util.Scanner;

public class InputEA {
	public static boolean operator3() {
		int nums[] = new int[3];
		int index = 0;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("정수 1 >>");
			String str1 = scan.nextLine();
			try {
				nums[index] = Integer.valueOf(str1);
			} catch (Exception e) {
				
				// TODO: handle exception
				continue;
			}

		}
		

		


	}

}
