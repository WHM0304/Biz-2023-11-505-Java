package com.callor.score.exec;

import com.callor.score.scoreservice.ScoreService;

public class Score {
	
	public static void main(String[] args) {
		ScoreService scoreService = new ScoreService();
		scoreService.inputScoreService();
		scoreService.printScore();
		
	}

}
