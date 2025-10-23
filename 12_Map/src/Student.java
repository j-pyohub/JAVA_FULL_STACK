
public class Student {
	private String studentNumber;
	private String name;
	
	public Student(String studentNumber, String name) {
		this.studentNumber = studentNumber;
		this.name = name;
	}

	@Override
	public String toString() {
		return "studentNumber=" + studentNumber + ", name=" + name;
	}
	
	
}
