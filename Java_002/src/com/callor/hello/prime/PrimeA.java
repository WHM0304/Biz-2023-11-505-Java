package com.callor.hello.prime;

public class PrimeA {
	public static void main(String[] args) {
		
		int num = 0;
		
		num = 9;
		System.out.println("=============================");
		System.out.printf("%d는 prime Number 인가 ?\n",num);
		System.out.println("-----------------------------");
		
		for(int i = 2; i < num; i++) {
			
			
			System.out.printf("%d MOD %d = %d\n" , num ,i ,num % i);
			
			
			
			
		}
		
		System.out.println("============================");
		
	}

}
