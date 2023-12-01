package com.callor.oop.keyboard;

// 1~ 50범위
import java.util.Scanner;

public class KeyboardCA {
	public static boolean hintEven(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int rndNum = (int) (Math.random() * 50) + 1;
			int count = 0;
			System.out.println("=".repeat(50));
			System.out.println("뤼팡의 황금열쇠를 찾아라");
			System.out.println("=".repeat(50));
			while (true) {
				System.out.println("1 ~ 50까지 범위의 숫자중 황금열쇠를 입력하세요");
				System.out.print("정수 >> ");
				String str = scan.nextLine();

				int num = 0;
				try {
					num = Integer.valueOf(str);
				} catch (Exception e) {
					System.out.println("=".repeat(50));
					System.out.println("정수를 정확히 입력해 주세요");
					System.out.printf("입력한 값 : (%s)\n", str);
					System.out.println("=".repeat(50));
					count++;
					continue;
				}
				if (num < 1 || num > 50) {
					System.out.println("=".repeat(50));
					System.out.println("1 ~ 50까지 범위의 정수를 입력하세요");
					System.out.println("=".repeat(50));
					count++;
					continue;
				}
				if (count == 2) {
					if (hintEven(rndNum)) {
						System.out.println("-".repeat(50));
						System.out.printf("황금열쇠는 짝수이다\n");
						System.out.println("-".repeat(50));
					} else {
						System.out.println("-".repeat(50));
						System.out.printf("황금열쇠는 홀수이다\n");
						System.out.println("-".repeat(50));
					}

				}
				if (num == rndNum) {
					System.out.println("=".repeat(50));
					System.out.println("참 잘했어요 : " + num);
					System.out.printf("%d 번 만에 맞추셨습니다\n", count + 1);
					System.out.println("=".repeat(50));
					break;
				} else if (num > rndNum) {
					System.out.println("=".repeat(50));
					System.out.println("입력한 값이 너무 커요");
					System.out.println("=".repeat(50));
					count++;

				} else if (num < rndNum) {
					System.out.println("=".repeat(50));
					System.out.println("입력한 값이 너무 작아요");
					System.out.println("=".repeat(50));
					count++;

				}
				if (count == 5) {
					System.out.println("=".repeat(50));
					System.out.printf("황금열쇠 찾기에  실패했습니다 정답은 %d 입니다\n", rndNum);
					System.out.println("=".repeat(50));
					break;
				}

			} // end while 두번째
			while (true) {
				System.out.print("다시하시려면 go , 종료하시려면 x 를 눌러주세요 >> ");
				String str = scan.nextLine();
				if (str.equalsIgnoreCase("go")) {
					break;
				}
				if (str.equalsIgnoreCase("x")) {
					System.out.println("=".repeat(50));
					System.out.println("종료합니다");
					System.out.println("bye!");
					System.out.println("=".repeat(50));
					return;
				}

			} // end while 세번째
			
		} // end while 첫번째

	}// end main

}
