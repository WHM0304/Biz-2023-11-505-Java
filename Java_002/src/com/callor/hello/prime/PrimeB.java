package com.callor.hello.prime;

public class PrimeB {
	public static void main(String[] args) {

		int num = 0;
		num = 15;
		System.out.println("================================");
		System.out.printf("%d는 Prime Number 인가?\n", num);
		System.out.println("--------------------------------");
		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				System.out.printf("%d MOD %d = 0, %d 는 소수가 아님\n", num, i, num);
			}

		}
		System.out.println("================================");

	}

}
