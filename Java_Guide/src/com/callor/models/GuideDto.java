package com.callor.models;

public class GuideDto {
	
	public String id;
	public String 종목명;
	public String 순서;
	public String 방법;
	@Override
	public String toString() {
		return   id +"\t"  + 종목명  +"\t" + 순서  +"\t" + 방법;
	}
	public GuideDto(String id, String 종목명, String 순서, String 방법) {
		super();
		this.id = id;
		this.종목명 = 종목명;
		this.순서 = 순서;
		this.방법 = 방법;
	}
	
	public GuideDto() {
		
	}

}
