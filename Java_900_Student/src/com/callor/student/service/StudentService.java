package com.callor.student.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;
import com.callor.student.utils.Line;

public class StudentService implements Service {
	Scanner scan = null;

	List<StudentDto> students = null;

	public StudentService() {
		// TODO: 생성자에서 정보를 부르기

		scan = new Scanner(System.in);
		this.loadStudent();

	}
	public StudentDto sameStdName(String name) {
		// TODO: 학생이름 찾기
		for (StudentDto std : students) {
			if (std.name.equals(name)) {
				return std;
			}
		}
		
		return null;
	}




	@Override
	public void loadStudent() {
		// TODO : 학생정보 불러들이기
		Scanner fileScan = null;
		InputStream is = null;
		try {
			is = new FileInputStream("src/com/callor/student/data/샘플-학생정보 데이터(2023-12-14).txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileScan = new Scanner(is);

		students = new ArrayList<StudentDto>();

		while (fileScan.hasNext()) {
			String line = fileScan.nextLine();
			String[] student = line.split(",");
			StudentDto studentDto = new StudentDto();
			studentDto.num = student[0];
			studentDto.name = student[1];
			studentDto.dept = student[2];
			studentDto.grade = student[3];
			studentDto.phoneNum = student[4];
			studentDto.addr = student[5];
			students.add(studentDto);
		}
		fileScan.close();

	}

	public void findStudent() {
		//TODO: 입력한 학생의 정보찾기
									
			while (true) {
				
				
				Line.dLine(100);
				System.out.println("찾는 학생이름을 입력하세요(종요하려면 QUIT를 입력) >> ");
				String str = scan.nextLine();
				Line.sLine(100);
				if (str.equals("QUIT"))
					return;
//				for(StudentDto dto : students) {
//					dto.num = this.sameStdName(str).num;
//					dto.name= this.sameStdName(str).name;
//				}

				if (this.sameStdName(str) != null) {
					System.out.printf("학번: %s\n", this.sameStdName(str).num);
					System.out.printf("이름 : %s\n", this.sameStdName(str).name);
					System.out.printf("학과 : %s\n", this.sameStdName(str).dept);
					System.out.printf("학년 : %s\n", this.sameStdName(str).grade);
					System.out.printf("전화번호 : %s\n", this.sameStdName(str).phoneNum);
					System.out.printf("주소 : %s\n", this.sameStdName(str).addr);
				} else {
					System.out.println("* 데이터가 없습니다");
					Line.dLine(100);
					System.out.printf("%s 자료는 없습니다.\n",str);
					Line.dLine(100);
					continue;
				}
			}

		




	}

}
