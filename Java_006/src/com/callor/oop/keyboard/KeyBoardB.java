package com.callor.oop.keyboard;

import java.util.Scanner;

// Math. random() method 를 사용하여 1 ~ 10까지 임의의 수를 하나생성
// Scanner 를 사용하여 키보드로 부터 정수 1 ~ 10 까지 입력받기
// random() 으로 생성한 수가 키보드로 입력한 값과 맞으면 "참잘했어요 : 000"
// 맞지 않으면 "다시 한번시도해 보세요 " 메시지를 보여주고 다시입력받기

// 2번째  맞지 않으면 random 값보다 입력한 값이 크면 " 값이 너무 커요" 아니면 "값이 너무작아요"

public class KeyBoardB {
	public static int ranNum(int ranNum) {
		return(int)(Math.random()* 10) +1 ;
	}
	
	public static void main(String[] args) {
		int num = 0;
		int ranNum = (int)(Math.random()* 10) +1 ;;
		
		Scanner scan = new Scanner(System.in);
		
		
		
		while(true) {
			
			try {
				System.out.print("정수 >> ");
				String str = scan.nextLine();
				num = Integer.valueOf(str);				
				System.out.println();
				
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력하세요");
				continue;
			}
			if(num >10) {
				System.out.println("10이하로 입력해주세요");
				System.out.println("=".repeat(40));
				continue;
			}
			if(ranNum == num) {
				System.out.println("=".repeat(30));
				System.out.printf("%d , 정답입니다\n" , ranNum);
				System.out.println("=".repeat(30));
				System.out.println("참 잘했어요 : " + ranNum);
				System.out.println("=".repeat(30));
				break;
			} else if(ranNum < num)  {
				System.out.println("=".repeat(30));
				System.out.printf("정답은 %d보다 값이 작아요\n" , num);
				System.out.println("=".repeat(30));
				
			} else if(ranNum > num) {
				System.out.println("=".repeat(30));
				System.out.printf("정답은 %d보다 값이 커요\n" , num);
				System.out.println("=".repeat(30));
				
			}
			
		}
		

		
		
		
	}

}
