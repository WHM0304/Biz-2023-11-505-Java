package com.callor.blackjack.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.blackjack.models.CardDto;
import com.callor.blackjack.service.CardService;

/*
 * CardService 인터페이스를 상속(implements) 하여 method 를 구현하고
 * 
 * 1. CardDto 객체를 요소로 하는 List 를 클래스 영역에 선언
 * 2. 생성자에서 List 객체를 초기화 하고
 * 3. makeCardDeck() method 에서 CardDto 를 생성하여
 * 4. List 에 add() 하는 코드 작성 
 * 
 */
public class CardServiceImplV1 implements CardService{
	
	// 클래스 영역에 List 를 선언하여
	// 현재 클래스의 생성자, makeCardDeck(), getDeck() method 에서
	// 공유 (접근 가능하도록) 하도록 한다
	// 특별한 경우가 아니면 private 로 선언하여 외부로부터 보호하기
	
	private List<CardDto> cardList= null;
	
	public CardServiceImplV1() {
		// TODO 생성자에서 리스트 객체 초기화
		cardList= new ArrayList<CardDto>();
		// 게임이 최초 시작이 되면 자동으로 카드 한벌을 생성해 두기
		this.makeCardDeck();
	}
	
	@Override
	public void makeCardDeck() {
		// TODO 카드만드는 메소드
		String strSuit = "♥♤♣◇";
		String strDenomination = "A234567890JQK";
		
		String[] strSuits = strSuit.split("");
		String[] strDenos = strDenomination.split(""); 
		
		for(String suit : strSuits) {
			
			for(String deno : strDenos) {
				
				CardDto cardDto = new CardDto();
				cardDto.suit = suit;
				cardDto.denomination = deno;
				
				int value = 0;
				try {
					value = Integer.valueOf(deno);
				} catch (Exception e) {
					if(deno.equals("A")) value = 1;
					else value = 10;
				}
				if(value < 1) { 
					value = 10;
					cardDto.denomination = "10";
				}
				cardDto.value = value;					
				cardList.add(cardDto);					
			}// for deno
			
		} // for suit
		
		// 순서대로 배열된 cardList 의 각 요소를 뒤죽박죽 섞어주기
		int size = cardList.size();
		
		for(int i = 0; i <100; i++) {
			// List 요소개수 범위의 임의의 index 두개 생성하기
			int index1 = (int)(Math.random() * size);
			int index2 = (int)(Math.random() * size);
			
			CardDto _dto = cardList.get(index1);
			cardList.set(index1, cardList.get(index2));
			cardList.set(index2, _dto);
			
		}
		
		
		
		
		
		// cardList 테스트 하기
		// for(CardDto dto : cardList) {
		// System.out.println(dto.toString());
		// }
		
		
	}
	
	
	
	/*
	 * cardList 에서 임의의 카드 한장을 return 하는 method
	 */

	@Override
	public CardDto getCard() {
		if(cardList.isEmpty()) this.makeCardDeck();
		// 가장 보편적인 코드
		// CardDto getCard = cardList.get(0);
		// cardList.remove(0);
		
		// remove() method 의 특성을 활용한 코드
//		CardDto getCard = cardList.remove(0);
//		return getCard;
		
		// 별도의 변수(return 할 객체가 담긴 변수)를 만들지 않기
		return cardList.remove(0);
	}
}
