package com.callor.score.scoredto;

import com.callor.score.scoreservice.ScoreService;

public class ScoreDto {
	ScoreService scoreService = null;
	
	public String stdNum;
	public int kor;
	public int eng;
	public int math;
	public int music;
	public int art;
	private int total;
	private float avg;

	
	
	public ScoreDto() {
		scoreService = new ScoreService();
		
	
	}
	

	
	public int getTotal() {
		total = kor;
		total += eng;
		total += math;
		total += music;
		total += art;
		return total;				
	}
	public float getAvg() {
		getTotal();
		avg = (float)total / 5;
		return avg;				
	}


	
	
}
