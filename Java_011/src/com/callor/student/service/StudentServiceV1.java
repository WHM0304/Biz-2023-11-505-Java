package com.callor.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;

public class StudentServiceV1 {

	private Scanner scan = null;
	private List<StudentDto> students = null;

	public StudentServiceV1() {
		scan = new Scanner(System.in);
		students = new ArrayList<StudentDto>();

	}

	public void inputStudent() {

		System.out.print("학번을 입력하세요 >> ");
		String stdNum = scan.nextLine();

		System.out.print("이름을 입력하세요 >> ");
		String stdName = scan.nextLine();

		System.out.print("학과를 입력하세요 >> ");
		String stdDept = scan.nextLine();

		System.out.print("학년을 입력하세요 >> ");
		String stdGrade = scan.nextLine();

		System.out.print("전화번호을 입력하세요 >> ");
		String stdTel = scan.nextLine();

		System.out.print("주소를 입력하세요 >> ");
		String stdAddr = scan.nextLine();
		StudentDto studentDto = new StudentDto();
		studentDto.num = stdNum;
		studentDto.name = stdName;
		studentDto.dept = stdDept;
		studentDto.grade = stdGrade;
		studentDto.tel = stdTel;
		studentDto.addr = stdAddr;
		students.add(studentDto);

	}

	public void inputStudents() {
		this.inputStudent();		
		int index = 0;
		int size = students.size();

			
		
	}

	

}
