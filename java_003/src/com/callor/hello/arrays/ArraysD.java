package com.callor.hello.arrays;

public class ArraysD {
	public static void main(String[] args) {
		int nums[] = new int[10];
		int sum = 0;
		for (int index = 0; index < 10; index++) {
			nums[index] = (int) (Math.random() * 50) + 51;
		}

		for (int i = 0; i < 10; i++) {
			if (nums[i] % 2 == 0) {
				System.out.printf("index %d 번 요소의 값 : %d\n", i, nums[i]);
			}
		}
		for (int i = 0; i < 10; i++) {

			if (nums[i] % 2 == 0) {
				sum += nums[i];
			}
		}
		System.out.println("짝수들의 합 :" + sum);
	}

}
