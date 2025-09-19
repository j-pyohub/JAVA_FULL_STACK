package test.com.oopsw.operation;

import com.oopsw.operation.NameList_02;

public class NameListTest_02 {
	public static void main(String[] args) {
		NameList_02 list = new NameList_02(5); 
		System.out.println(list);
		list.add("È«±æµ¿");
		list.add("È«±æµ¿");
		list.add("±è±æµ¿");
		list.add("¿Õ±æµ¿");
		System.out.println(list);
	}
}
