package com.Callor.score.exec;

import com.Callor.score.medel.ScoreDto;
import com.Callor.score.service.ScoreServiceA;

public class ScoreB {
	
	public static void main(String[] args) {
		ScoreServiceA scoreService = new ScoreServiceA(); 
		// ScoreDto score = new ScoreDto();
		scoreService.loadScores();
		scoreService.printScores();
		
	}
	
	

}
