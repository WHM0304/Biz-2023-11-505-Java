package com.callor.student.exec;

import com.callor.student.service.Service;
import com.callor.student.service.StudentService;

public class Exec {
	
	
	public static void main(String[] args) {
		Service studentService = new StudentService();
		studentService.findStudent();
		
	}

}
