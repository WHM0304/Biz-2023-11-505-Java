package com.callor.iolist.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.iolist.models.iolistIndex;
import com.callor.iolist.models.itemDto;
import com.callor.iolist.service.Service;

public class ServiceImplV1 implements Service{
	private String fileData = null;
	private List<itemDto> itemList = null;
	private String[] iolList = new String[9];
	private Integer sellSum = 0;
	private Integer buySum = 0;
	private int index = 0;
	public ServiceImplV1(String fileData) {
		this.fileData = fileData;
		itemList = new ArrayList<itemDto>();
	}
	@Override
	public void loadData() {
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(this.fileData);
		} catch (FileNotFoundException e) {
			
		}
		scan = new Scanner(is);
		while(scan.hasNext()) {
			String str = scan.nextLine();			
			String[] lines = str.split(",");								
			
			try {
				
				itemDto item = new itemDto(
						lines[iolistIndex.거래일자.index],
						lines[iolistIndex.거래처명.index],
						lines[iolistIndex.상품명.index],
						lines[iolistIndex.매입단가.index],
						lines[iolistIndex.판매단가.index],
						lines[iolistIndex.구분.index],
						lines[iolistIndex.수량.index]);
				iolList = lines;
				this.itemList.add(item);
				buySum += Integer.valueOf(iolList[iolistIndex.수량.index]) * Integer.valueOf(iolList[iolistIndex.매입단가.index]); 
				sellSum += Integer.valueOf(iolList[iolistIndex.수량.index]) * Integer.valueOf(iolList[iolistIndex.판매단가.index]);
				index++;
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
		scan.close();
	}
	
	
	

	@Override
	public void printData() {
		System.out.println("=".repeat(100));
		System.out.println("거래일자\t거래처\t상품이름\t매입금액\t판매금액");
		System.out.println("-".repeat(100));
		
		for(itemDto dto : itemList) {
			
			System.out.println(dto);
		}
		System.out.println("-".repeat(100));
		System.out.print("거래건수\t\t");
		System.out.print(index + "\t\t\t\t\t");
		System.out.print(buySum + "\t");
		System.out.print(sellSum + "\n");
		System.out.println("=".repeat(100));
		
	}

}
