package com.oopsw.school; 

public class SchoolTest {
	public static void main(String[] args) {
		//1. ÀÔ·Â, È®ÀÎ
		SchoolList list = new SchoolList(2);
		System.out.println(list);
		list.add(new Student("È«±æµ¿", "20010101"));
		list.add(new Student("È«±æµ¿", "20010101"));
		list.add(new Teacher("ÀÌ¼ø½Å", "t2015"));
		list.add(new Student("±è±æ¶Ë", "10050505"));
		System.out.println(list);
	}

}
