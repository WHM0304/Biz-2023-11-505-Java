package com.callor.student.exec;

import com.callor.student.service.impl.StartServiceImplV3;
import com.callor.sudent.service.StartService;

public class MainExB {
	
	
	public static void main(String[] args) {
		StartService startService = new StartServiceImplV3();
		startService.startApp();
	}

}
