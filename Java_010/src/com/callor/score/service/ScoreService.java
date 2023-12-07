package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;

public class ScoreService {
	// 클래스 영역에서 선안만 하고
	private List<ScoreDto> scores = null;
	private NumberService numService = null;
	// 생성자 에서
	public ScoreService() {
		// 초기화 (사용할 준비하기)
		scores = new ArrayList<ScoreDto>();
		numService = new NumberService();
	}
	
	public void inputScore() {
		
		int scoreKor = numService.inputNumber("국어 점수");
		int scoreEng = numService.inputNumber("영어 점수");
		int scoreMath = numService.inputNumber("수학 점수");
		
		ScoreDto scoreDto = new ScoreDto();
		scoreDto.kor = scoreKor;
		scoreDto.eng =scoreEng;
		scoreDto.math =scoreMath;
		
		scores.add(scoreDto);
	} // end inputScore()
	
	public void inputScore(int start, int end) {
		int scoreKor = numService.inputNumber("국어점수",start,end);
		int scoreEng = numService.inputNumber("영어점수",start,end);
		int scoreMath = numService.inputNumber("수학점수",start,end);
		ScoreDto scoreDto = new ScoreDto();
		scoreDto.kor = scoreKor;
		scoreDto.eng = scoreEng;
		scoreDto.math =scoreMath;
		scores.add(scoreDto);
	}
	
	
}
