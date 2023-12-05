package com.Callor.score.exec;

import com.Callor.score.service.StudentService;

public class StudentA {
	
	public static void main(String[] args) {
		String data = "src/com/Callor/score/service/student.txt";
		StudentService studentService = new StudentService(data);
		studentService.loadStudents();
		
	}

}
