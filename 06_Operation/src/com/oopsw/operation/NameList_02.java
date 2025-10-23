package com.oopsw.operation;

public class NameList_02 {
	private String[] names;
	private int count;
	
	public NameList_02 (){
		names = new String[5];
	}
	
	public NameList_02(int length){
		names = new String[length];;
	}
	
	public void add(String name){
		if (count == names.length) return;
		for (int i = 0; i < count; i++) {
			if(names[i].equals(name)) return;
		}
		names[count++] = name;
	}

	@Override
	public String toString() {
		String message = "";
		for (int i = 0; i < count; i++) {
			message += names[i] + " ";
		}
		return message;
	};
}
