package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.util.Line;

public class NumbersB {

	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		int num = numService.inputNum("숫자를");
		Line.sLine(50);
		for (int i = 0; i < num; i++) {

			for (int j = 0; j < i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		Line.dLine(50);

	}

}
