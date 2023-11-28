package com.callor.hello.method;

public class MethodJ {

	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		for (int index = 0; index < 5; index++) {
			int num = (int) (Math.random() * 100) + 1;			
			if (isEven(num)) {
				System.out.printf("%2d 는 짝수입니다\n",num);
			} else {
				System.out.printf("%2d 는 짝수가 아님\n", num);
			}
		}

	}

}
