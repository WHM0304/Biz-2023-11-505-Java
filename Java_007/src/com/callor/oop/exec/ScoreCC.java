package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;
import com.callor.oop.utils.Line;

public class ScoreCC {
	public static void main(String[] args) {
		ScoreService[] scores = new ScoreService[10];
		scores[0] = new ScoreService();
		
		
		for(int i = 0; i < scores.length ; i++) {
			scores[i] = new ScoreService();
		}
		
		
		//10개의 배열의 각 과목점수를 Random 으로 생성하고자 한다
		for(int i = 0 ; i < scores.length ; i ++) {
			scores[i].scoreKor = (int)(Math.random() * 50 ) + 51;
			scores[i].scoreEng = (int)(Math.random() * 50 ) + 51;
			scores[i].scoreMath = (int)(Math.random() * 50 ) + 51;
		}
//		Line.title("성적표");
		Line.title(50, "성적표");		
		System.out.println(" 국어\t영어\t수학\t총점\t평균");
		Line.sLine(50);
		for(int i = 0; i< scores.length; i++) {			
			System.out.printf(" %2d\t%2d\t%2d\t%3d\t%4.2f\n"
						, scores[i].scoreKor
						, scores[i].scoreEng
						, scores[i].scoreMath
						, scores[i].getScoreTotal()
						, scores[i].getScoreAvg());
			// 배열에 저장된 점수 화면에 출력하기
		}
		Line.dLine(50);
		
		
	}

}
