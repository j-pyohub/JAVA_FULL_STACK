//표수정
package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

public class SchoolTest {
	public static void main(String[] args) {
		Person[] persons = new Person[2];
		
		persons[0] = new Student("20010101", "김선생");
		persons[1] = new Teacher("t2001", "김선생");
		
		

		//중복 시 저장하지 않음
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons.length; j++) {
				if(i < j){
					if (persons[i].equals(persons[j])){
						persons[j] = null;
					}
				}
			}
		}
		System.out.println(persons[0]);
//		for (int i = 0; i < persons.length; i++) {
//			if (persons[i] != null){
//				System.out.println(persons[i].toString());
//			}
//		}
	}
}
