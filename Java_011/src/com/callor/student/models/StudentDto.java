package com.callor.student.models;

import java.util.List;
import java.util.Scanner;

/*
 * 학번, 이름, 학과, 학년, 전화번호, 주소를 포함하는
 * 학생정보를 저장할 Dto 클래스 선언	
 */
public class StudentDto {
	
	public String num;
	public String name;
	public String dept;
	public String grade;
	public String tel;
	public String addr;
	Scanner scan = null;
	StudentDto studentDto = null;
	
	
	public StudentDto() {
		scan = new Scanner(System.in);
		
	}
	
	
	public void inputStudent() {		 		 
		scan.nextLine();
		studentDto = new StudentDto();
		String num = studentDto.num;
		String name = studentDto.name;
		String dept = studentDto.dept;
		String grade = studentDto.grade;
		String tel= studentDto.tel;
		String addr= studentDto.addr;
		
		
	}
	
	
	
	

} // end class
