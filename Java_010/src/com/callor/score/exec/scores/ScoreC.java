package com.callor.score.exec.scores;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

public class ScoreC {

	public static void main(String[] args) {
		NumberService numService = new NumberService();
		ScoreDto scoreDto = new ScoreDto();
		List<ScoreDto> scores;
		scores = new ArrayList<ScoreDto>();
		int start = 50;
		int end = 100;
//		List<ScoreDto> scores = new ArrayList<ScoreDto>();
//		scoreDto.kor = numService.inputNumber("국어점수를", start, end);
//		scoreDto.eng = numService.inputNumber("영어점수를", start, end);
//		scoreDto.math = numService.inputNumber("수학점수를", start, end);
//		scores.add(scoreDto);
//		scoreDto.kor = numService.inputNumber("국어점수를", start, end);
//		scoreDto.eng = numService.inputNumber("영어점수를", start, end);
//		scoreDto.math = numService.inputNumber("수학점수를", start, end);
//		scores.add(scoreDto);
//		scoreDto.kor = numService.inputNumber("국어점수를", start, end);
//		scoreDto.eng = numService.inputNumber("영어점수를", start, end);
//		scoreDto.math = numService.inputNumber("수학점수를", start, end);
//		scores.add(scoreDto);
//		System.out.printf("%d\t%d\t%d\t%d\n", scoreDto.kor, scoreDto.eng, scoreDto.math, scoreDto.getTotal());
		for(int i = 0; i <3; i++) {
			scoreDto.kor = numService.inputNumber("국어점수를", start, end);
			scoreDto.eng = numService.inputNumber("영어점수를", start, end);
			scoreDto.math = numService.inputNumber("수학점수를", start, end);
			ScoreDto dto = new ScoreDto();
			scores.add(scoreDto);
			
		}
		for(int i = 0; i <scores.size(); i++) {
			ScoreDto dto = scores.get(i);			
			System.out.printf("%d\t",dto.kor);
			System.out.printf("%d\t",dto.eng);
			System.out.printf("%d\t",dto.math);
			System.out.printf("%d\n",dto.getTotal());
		}
		
		
	}

}
