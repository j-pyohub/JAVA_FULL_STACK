//표수정
package test.com.oopsw.school;

import com.oopsw.school.TeacherVO;

public class TeacherTest {
	public static void main(String[] args) {
		//입력
		TeacherVO t1 = new TeacherVO("5001001", "수학", "홍길동", 'M');
		TeacherVO t2 = new TeacherVO("5001002", "체육", "김구", 'M');
		TeacherVO t3 = new TeacherVO("5001003", "한국사", "유관순", 'F');
		
		//출력
		t1.mathTeacher();
		t2.mathTeacher();
		t3.mathTeacher();
		
//		
//		//입력
//		TeacherVO[] teachers = new TeacherVO[3];
//
//		teachers[0] = new TeacherVO("5001001", "수학", "홍길동", 'M');
//		teachers[1] = new TeacherVO("5001002", "체육", "김구", 'M');
//		teachers[2] = new TeacherVO("5001003", "한국사", "유관순", 'F');
//		
//		//출력
//		for (int i = 0; i < teachers.length; i++) {
//			teachers[i].mathTeacher();
//		}	
	}
}
