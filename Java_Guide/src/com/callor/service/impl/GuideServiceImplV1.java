package com.callor.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.models.GuideDto;
import com.callor.service.GuideService;
import com.callor.service.utils.Line;

public class GuideServiceImplV1 implements GuideService {

	private List<GuideDto> guideList = null;

	private String fileData = null;

	public GuideServiceImplV1(String fileData) {
		this.guideList = new ArrayList<GuideDto>();
		this.fileData = fileData;
	}

	@Override
	public void loadGuide() {
		InputStream is = null;
		Scanner scan = null;

		try {
			is = new FileInputStream(this.fileData);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan = new Scanner(is);
		while (scan.hasNext()) {
			String str = scan.nextLine();

			String[] lines = str.split(",");

			GuideDto guDto = new GuideDto(lines[0], lines[1], lines[2], lines[3]);
			guideList.add(guDto);
		}

		scan.close();

	}

	@Override
	public void printGuideList() {
//		Line.dLine(100);
//		System.out.println("id\t종목명\t\t\t순서\t\t방법");
//		Line.sLine(100);
//		for (GuideDto dto : guideList) {
//			String idSearch = dto.id.substring(3);
//			int index = Integer.valueOf(idSearch);
//
////			if(idSearch.equals("001")) {
////				System.out.printf("%s\t%s\t\t%s\t\t%s\n", dto.id, dto.종목명, dto.순서, dto.방법);				
////			}
//			if (index == 1) {
//				System.out.print(dto.id);
//				System.out.print(dto.종목명);
//				System.out.print(dto.순서);
//				System.out.println(dto.방법);
//			}
//			index ++;
//		}
//		Line.sLine(100);
//		for (GuideDto dto : guideList) {
//			String idSearch = dto.id.substring(3);
//			int index = Integer.valueOf(idSearch);
//
////			if(idSearch.equals("001")) {
////				System.out.printf("%s\t%s\t\t%s\t\t%s\n", dto.id, dto.종목명, dto.순서, dto.방법);				
////			}
//			if (index == 2) {
//				System.out.print(dto.id);
//				System.out.print(dto.종목명);
//				System.out.print(dto.순서);
//				System.out.println(dto.방법);
//			}
//			index ++;
//		}
//		Line.sLine(100);
//		
//		Line.dLine(100);
		

		Line.dLine(100);
		System.out.println("id\t종목명\t\t\t순서\t\t방법");
		Line.sLine(100);
		for (GuideDto dto : guideList) {
			String search = dto.id.substring(2);
			if (search.equals("001")) {
				System.out.printf("%s\t%s\t\t%s\t\t%s\n", dto.id, dto.종목명, dto.순서, dto.방법);

			}

		}
		Line.sLine(100);
		for (GuideDto dto : guideList) {
			String search = dto.id.substring(2);
			if (search.equals("002")) {
				System.out.printf("%s\t%s\t\t%s\t\t%s\n", dto.id, dto.종목명, dto.순서, dto.방법);

			}

		}
		Line.sLine(100);
		for (GuideDto dto : guideList) {
			String search = dto.id.substring(2);
			if (search.equals("003")) {
				System.out.printf("%s\t%s\t\t%s\t\t%s\n", dto.id, dto.종목명, dto.순서, dto.방법);

			}

		}
		Line.sLine(100);
		for (GuideDto dto : guideList) {
			String search = dto.id.substring(2);
			if (search.equals("004")) {
				System.out.printf("%s\t%s\t\t%s\t\t%s\n", dto.id, dto.종목명, dto.순서, dto.방법);

			}

		}
		Line.dLine(100);

	}

}
