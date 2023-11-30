package com.callor.oop.input;

import java.util.Scanner;

public class InputEB {
	
	public static void main(String[] args) {
		int[] nums = new int[3];
		int index = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 1 >> ");
		String str = scan.nextLine();
		nums[index++] = Integer.valueOf(str);
		
		System.out.println("정수 2 >> ");
		str = scan.nextLine();
		nums[index++] = Integer.valueOf(str);
		
		System.out.println("정수 3 >> ");
		str = scan.nextLine();
		nums[index] = Integer.valueOf(str);
		
		System.out.println("=".repeat(30));
		for(int i = 0;  i < nums.length ; i++) {
			System.out.println(nums [i]);
			
		}
		
		
	}

}
