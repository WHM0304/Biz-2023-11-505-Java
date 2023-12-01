package com.callor.oop.keyboard;

//Math. random() method 를 사용하여 1 ~ 10까지 임의의 수를 하나생성
//Scanner 를 사용하여 키보드로 부터 정수 1 ~ 10 까지 입력받기
//random() 으로 생성한 수가 키보드로 입력한 값과 맞으면 "참잘했어요 : 000"
//맞지 않으면 "다시 한번시도해 보세요 " 메시지를 보여주고 다시입력받기
//2번째  맞지 않으면 random 값보다 입력한 값이 크면 " 값이 너무 커요" 아니면 "값이 너무작아요"

//횟수를 표기하고 5번 까지 못맞추면 GAMEOVER시키기
//실패하면, 정답을 보여주고 종료
import java.util.Scanner;

public class KeyboardC {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rndNum = (int) (Math.random() * 10) + 1;
		int count = 1;
		System.out.println("=".repeat(50));
		System.out.println("숫자 맞추기 게임");
		System.out.println("=".repeat(50));
		while (true) {
			System.out.println("1 ~ 10까지 범위의 정수를 입력하세요");
			System.out.print("정수 >> ");
			String str = scan.nextLine();

			int num = 0;
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해 주세요");
				System.out.printf("입력한 값 : (%s)\n", str);
				count++;
				continue;
			}
			if (num < 1 || num > 10) {
				System.out.println("1 ~ 10까지 범위의 정수만 입력하세요");
				count++;
				continue;
			}
			if (num == rndNum) {
				System.out.println("참 잘했어요 : " + num);
				System.out.printf("%d 번 만에 맞추셨습니다 " ,count);
				break;
			} else if (num > rndNum) {
				System.out.println("입력한 값이 너무 커요");
				count++;

			} else if (num < rndNum) {
				System.out.println("입력한 값이 너무 작아요");
				count++;

			}
			if(count == 5) {
				System.out.printf("5번 틀리셨습니다 정답은 %d 입니다\n" , rndNum);
				break;
			}
			System.out.println("다시한번 잘 생각해 보세요");
		} // end while
		System.out.println("GAME OVER!!");

	}// end main

}
