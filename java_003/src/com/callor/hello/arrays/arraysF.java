package com.callor.hello.arrays;

public class arraysF {
	// 11월 28일 생각해보기
	public static void main(String[] args) {
		int nums[] = new int[10];

		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		for (int i = 0; i < 10; i++) {
			if (nums[i] > 80) {
				System.out.println(nums[i]);
				break;
			}
		}

	}

}
