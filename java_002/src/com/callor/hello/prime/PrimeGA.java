package com.callor.hello.prime;

public class PrimeGA {
	public static void main(String[] args) {

		for (int i = 2; i < 100; i++) {

			int num = i+1;
			int index = 0;
			for (index = 2; index < num; index++) {
				if ((num) % index == 0) {
					break;
				}
			}
			if (index < num) {				
			} else {
				System.out.printf("%3d 는 소수임\n", num);
			}
		}
	}

}
