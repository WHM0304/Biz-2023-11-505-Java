package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.util.Line;

public class NumbersG {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		int num = numService.inputNum("점수를");
		Line.sLine(50);
		if (num > 100) {
			System.out.println("100 이하의 숫자를 입력해주세요");
		} else if (num > 94) {
			System.out.println("A+");
			System.out.println("축하합니다.");
		} else if (num > 89) {
			System.out.println("A");
			System.out.println("축하합니다.");
		} else if (num > 84) {
			System.out.println("B+");
			System.out.println("축하합니다.");
		} else if (num > 79) {
			System.out.println("B");
			System.out.println("축하합니다.");
		} else if (num > 74) {
			System.out.println("C+");
			System.out.println("더 분발 하세요");
		} else if (num > 69) {
			System.out.println("C");
			System.out.println("더 분발 하세요");
		} else if (num > 64) {
			System.out.println("D+");
			System.out.println("더 분발 하세요");
		} else if (num > 59) {
			System.out.println("D");
		} else {
			System.out.println("F");
			System.out.println("낙제 입니다");
		}
		Line.dLine(50);

	}

}
