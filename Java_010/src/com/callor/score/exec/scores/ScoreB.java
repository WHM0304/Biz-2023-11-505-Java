package com.callor.score.exec.scores;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

public class ScoreB {
	
	public static void main(String[] args) {
		
		NumberService numService = new NumberService();
		ScoreDto scoreDto = new ScoreDto();
		int num1 = numService.inputNumber("국어점수를",50,100);		
		scoreDto.kor = num1; 
		num1 = numService.inputNumber("영어점수를", 50, 100);
		scoreDto.eng = num1;
		num1 = numService.inputNumber("수학점수를", 50, 100);
		scoreDto.math = num1;
		System.out.printf("3과목의 총점 : %d \n",scoreDto.getTotal());
		
		
	}

}
