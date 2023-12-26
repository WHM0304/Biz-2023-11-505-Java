package com.callor.blackjack.exec;

import com.callor.blackjack.models.CardDto;

public class ExecA {
	
	
	
	public static void main(String[] args) {
		CardDto cardDto = new CardDto();
		
		
		// CardDto 클래스를 사용한 cardDto 객체의
		// 각 맴버변수에 값 할당하기
		cardDto.suit = "다이아몬드";
		cardDto.denomination = "A";
		cardDto.value = 1;
		
		// 맴버변수 중 suit 에 저장된 값을 읽어서 console 에 출력하기
		System.out.println(cardDto.suit);
		// 이러한 것을 변수에 접근한다
		
		CardDto cDto = new CardDto();
		cDto.suit = "하트";
		
		System.out.println(cardDto.toString());
		System.out.println(cDto.toString());
		
		
		
		
	}

}
