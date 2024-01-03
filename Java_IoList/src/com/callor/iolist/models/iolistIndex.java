package com.callor.iolist.models;

public enum iolistIndex {
	거래일자(0),
	상품명(2),
	거래처명(3),
	대표자명(4),
	구분(5),
	수량(6),
	매입단가(7),
	판매단가(8);
	public int index;
	iolistIndex(int index) {
		this.index = index;
	}

}
