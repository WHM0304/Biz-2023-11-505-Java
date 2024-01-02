package com.callor.exec;

import com.callor.service.GuideService;
import com.callor.service.impl.GuideServiceImplV1;

public class Exec {
	public static void main(String[] args) {
		String dataFile = "src/guide.txt";
		GuideService guideService = new GuideServiceImplV1(dataFile);
		guideService.loadGuide();
		guideService.printGuideList();
	}

}
