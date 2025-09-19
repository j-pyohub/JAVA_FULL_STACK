package com.oopsw.school;

public class SchoolList {
	//1.1
	private Person[] list;
	private int count;
	
	//1.2
	public SchoolList(int length){
		list = new Person[length];
	}
	
	//1. 학생 또는 교사 입력
	public void add(Person p){
		if(count == list.length) return;
		for (int i = 0; i < count; i++) {
			if(list[i].equals(p)) return;
		}
		list[count++] = p;
	}

	//1.3 확인
	@Override
	public String toString() {
		String message = "";
		for (int i = 0; i < count; i++) {
			message += list[i].toString() + "\n";
		}
		return message;
	}
}
