package com.Callor.score.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Callor.score.medel.StudentDto;

public class StudentService {
	private Scanner scan = null;
	private List<StudentDto> students = null;

	public StudentService(String dataFile) {
		InputStream is = null;

		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		scan = new Scanner(is);
		students = new ArrayList<>();
	}// end 생성자

	public void loadStudents() {
		while (scan.hasNext()) {
			String line = scan.nextLine();

			String lines[] = line.split(",");
			StudentDto studentDto = new StudentDto();
			try {
				studentDto.num = lines[0];
				studentDto.name = lines[1];
				studentDto.name = lines[2];
				studentDto.name = lines[3];
				studentDto.name = lines[4];
				studentDto.name = lines[5];
				
			} catch (Exception e) {
				System.out.println("데이터 읽는 중 오류발생");
				System.out.println(line);
				break;
			}//end catch
			students.add(studentDto);
		}// end while
	}

} // end class
