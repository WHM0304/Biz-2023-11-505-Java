package com.callor.hello.arrays;

public class ArraysA {
	public static void main(String[] args) {
		int nums[] = new int[10];

		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		for (int i = 0; i < 10; i++) {
			if (nums[i] > 80) {
				System.out.printf("최초의 index %d ,  그값  : %d\n", i, nums[i]);
				break;
			}
		}

	}

}
