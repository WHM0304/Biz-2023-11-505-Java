package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.util.Line;

public class ScannerE {
	
	public static void main(String[] args) {
		NumberService numberService = new NumberService();
		
		Line.dLine(50);
		int num = numberService.inputNum("원하는 구구단 단수를");
		Line.dLine(50);
		System.out.printf( "\t%d 단 구구단\n",num);
		Line.sLine(50);
		for(int i = 1 ; i < 10; i++) {
			System.out.printf("\t%d x %d = %d\n" , num,i,num*i);
			
		}
		Line.dLine(50);
	}

}
