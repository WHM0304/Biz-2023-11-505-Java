package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.util.Line;

public class NumbersD {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		int num = 0;
		int index = 0;
		Line.dLine(50);
		while (num < 1000) {
			
			num += numService.inputNum("숫자를");			
			index++;
		}
		Line.sLine(50);
		System.out.printf("%d 번 입력한 숫자 총 합 : %d", index, num);

	}

}
