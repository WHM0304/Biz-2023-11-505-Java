package com.callor.hello.prime;

public class PrimeG {
	public static void main(String[] args) {
		for (int num = 2; num < 100; num++) {

			int index = 0;
			
			
			for (index = 2; index < num + 1; index++) {
				
				if ((num + 1) % index == 0) {

					break;
				}
			}
			if (index < num) {
				System.out.printf("%3d MOD %3d = %3d", num, index, num % index);
				System.out.printf("%3d 는 소수가 아님\n", num);
			} else {
				System.out.printf("%3d 는 소수임\n", num);
			} 

		}

	}

}
