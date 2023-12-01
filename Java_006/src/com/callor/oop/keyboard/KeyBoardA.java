package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyBoardA {
	
	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("정수 >> ");
			String str = scan.nextLine();
			
			try {
				num = Integer.valueOf(str);
				
			} catch (Exception e) {
				System.out.println("정확한 값 입력해주세요");
				continue;
			}
			if(num < 10) {
				System.out.println("10 이상의 값을 입력해주세요");
				System.out.println("=========================");
				continue;
			}
			for(int i = 10; i <num ; i++) {
				if(num % 2 == 0) {
					
				}
			}continue;
			
			
			
		}
	
		
	}

}
