package com.callor.score.scoreservice;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.line.Line;
import com.callor.score.scoredto.ScoreDto;

public class ScoreService {
	private List<ScoreDto> scores = null;
	public int korSum = 0;
	public int engSum = 0;
	public int mathSum = 0;
	public int musicSum = 0;
	public int artSum = 0;
	public int totalSum = 0;
	public int index = 10;
	private float korAvg = 0;
	private float engAvg = 0;
	private float mathAvg = 0;
	private float artAvg = 0;
	private float musicAvg = 0;
	private float avgAvg = 0;
	public ScoreService() {
		scores = new ArrayList<ScoreDto>();
	}

	public void inputScoreService() {
		
		for (int i = 0; i < index; i++) {
			int scoreKor = (int) (Math.random() * 50) + 51;
			int scoreEng = (int) (Math.random() * 50) + 51;
			int scoreMath = (int) (Math.random() * 50) + 51;
			int scoreMusic = (int) (Math.random() * 50) + 51;
			int scoreArt = (int) (Math.random() * 50) + 51;
			String strStdNum = "23000";
			if (scores.size() > 0) {
				strStdNum = scores.get(scores.size() - 1).stdNum;
			}

			int intStdNum = Integer.valueOf(strStdNum.substring(2));
			intStdNum++;
			strStdNum = String.format("23%04d", intStdNum);
			ScoreDto scoreDto = new ScoreDto();
			scoreDto.stdNum = strStdNum;
			scoreDto.kor = scoreKor;
			scoreDto.eng = scoreEng;
			scoreDto.math = scoreMath;
			scoreDto.music = scoreMusic;
			scoreDto.art = scoreArt;
			korSum += scoreKor;
			engSum += scoreEng;
			mathSum += scoreMath;
			musicSum += scoreMusic;
			artSum += scoreArt;
			totalSum += scoreDto.getTotal();
			korAvg = (float)korSum / index;
			engAvg = (float)engSum / index;
			mathAvg = (float)mathSum / index;
			musicAvg = (float)musicSum / index;
			artAvg = (float)artSum / index;
			avgAvg = (korAvg + engAvg +mathAvg + musicAvg + artAvg) / 5;
			scores.add(scoreDto);
			
		}

	}// end inputScoreService

	public void printScore() {
		ScoreDto scoreDto = new ScoreDto();
		
		Line.dLine(100);
		System.out.println("* 한울 고교 새별 반 성적 리스트 *");
		Line.dLine(100);
		System.out.println("학번\t\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		Line.sLine(100);
		for(ScoreDto dto : scores) {
			System.out.printf("%s\t\t",dto.stdNum);
			System.out.printf("%3d\t", dto.kor);
			System.out.printf("%3d\t", dto.eng);
			System.out.printf("%3d\t", dto.math);
			System.out.printf("%3d\t", dto.music);
			System.out.printf("%3d\t", dto.art);
			System.out.printf("%3d\t", dto.getTotal());
			System.out.printf("%.2f\n",dto.getAvg());
			
			
		}
		Line.sLine(100);
		System.out.print("총점\t\t");
		System.out.printf("%d\t",korSum);
		System.out.printf("%d\t",engSum);
		System.out.printf("%d\t",mathSum);
		System.out.printf("%d\t",musicSum);
		System.out.printf("%d\t",artSum);
		System.out.printf("%d\n",totalSum);
		System.out.print("평균\t\t");
		System.out.printf("%.2f\t",korAvg);
		System.out.printf("%.2f\t",engAvg);
		System.out.printf("%.2f\t",mathAvg);
		System.out.printf("%.2f\t",musicAvg);
		System.out.printf("%.2f\t\t",artAvg);
		System.out.printf("%.2f",avgAvg);
		Line.dLine(100);
		
		
		
	
	}

}
