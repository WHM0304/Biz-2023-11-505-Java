package com.callor.hello.method;

public class MethodG {

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

		int num = (int)(Math.random() * 100) + 2 ;
		boolean isPrime = isPrime(num);
		if(isPrime) {
			System.out.println(num + " 는 소수임");
		} else {
			System.out.println(num + " 는 소수가 아님");
		}

	}

}
