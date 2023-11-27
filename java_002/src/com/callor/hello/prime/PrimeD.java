package com.callor.hello.prime;

public class PrimeD {
	
	public static void main(String[] args) {
		int index = 0;
		int num = 0;
		num = (int)((Math.random() * 10) + 1);
		System.out.println("==========================");
		System.out.printf("%d는 Prime Number 인가 ?\n" , num);
		System.out.println("--------------------------");
		for(index = 2; index < num ; index++) {
			if(num % index == 0) {
				break;
			
			}

			
		}
			if(index < num ) {
				System.out.printf("%d MOD %d = %d\n",
						num,index, num % index);
			System.out.println(num +  " 는 소수가 아님" );
			
		} else {
			System.out.println(num + " 는 소수");
		}
		System.out.println("==========================");
			
			
				
			
		
		
	}

}
