package com.callor.student.exec;

import com.callor.student.service.impl.StartServiceImplV2;
import com.callor.student.service.impl.StudentServiceImplV1;
import com.callor.sudent.service.StartService;
import com.callor.sudent.service.StudentService;

public class MainExA {
	public static void main(String[] args) {
		String studentDataFile = "src/com/callor/student/data/Student.txt";
		StudentService stService = new StudentServiceImplV1();
		StartService start = new StartServiceImplV2(stService);
		start.mainMenu();
//		Integer result = start.selectMenu();
//		start.startApp();
		
		
		
		
	}

}
