package com.callor.iolist.models;

public class itemDto {
	
	public String 거래일자;
	public String 거래처;
	public String 상품이름;
	public String 매입금액;
	public String 판매금액;
	public String 구분;
	public String 수량;
	@Override
	public String toString() {
		return  거래일자 + "\t"+ 거래처 + "\t" + 상품이름 + "\t" + 매입금액 + "\t" + 판매금액 ;
	}
	public itemDto(String 거래일자, String 거래처, String 상품이름, String 매입금액, String 판매금액,String 구분 , String 수량) {
		super();
		this.거래일자 = 거래일자;
		this.거래처 = 거래처;
		this.상품이름 = 상품이름;
		this.매입금액 = 매입금액;
		this.판매금액 = 판매금액;
		this.구분 = 구분;
		this.수량 = 수량;
	}
	public itemDto() {
		
	}


	
	

}
