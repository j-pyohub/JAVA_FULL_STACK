package com.oopsw.operation;

public class NameList { //System.out.println 안 씀
	private String[] names; //선언
	private int count;
	public NameList(){
		this(5); //자신 또는 부모의 생성자를 호출, 1줄 1번만 가능
		//names = new String[5]; //생성
	}
	public NameList(int length){ //생성자는 매개인자 많은것부터 구현 권장
		names = new String[length];
	}
	public void add(String name){ //인터페이스 설계
		if (count == names.length) return;
		for (int i = 0; i < count; i++) {
			if (names[i].equals(name)) return; //예외에서 처리하는 게 가장 좋음
		}
		names[count++]=name; //초기화
	}
	@Override
	public String toString() {
		String message = "";
		for(int i = 0; i<count; i++){
			message += names[i] + " ";
		}
		return message;
	}
	
}
