package com.Callor.score.exec;

import com.Callor.score.medel.ScoreDto;

public class ScoreA {
	
	private void mian() {
		// TODO Auto-generated method stub

		// ScoreA 에서 ScoreDto 클래스에 선언된 변수들을
		// 사용하여 정보처리를 하기위해 score 객체로 선언하기
		// 생성자(new ScoreDto())를 사용하여 score 객체를
		// 초기화 한다(인스턴스 화(化) 한다)
		ScoreDto score = new ScoreDto();
		// 객체를 통하여 변수선언한다
		score.stdNum = "0001";
		score.kor = 80;
		score.eng = 90;
		score.math = 80;
		// private 로 선언된 total 과 avg 는
		// score 객체를 통하여 직접 접근 할수 없다
//		score.total = 100;
//		score.avg = 200;
		
	}
	
	
	
	
}
