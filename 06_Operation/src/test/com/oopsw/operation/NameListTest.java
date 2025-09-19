package test.com.oopsw.operation;

import com.oopsw.operation.NameList;

public class NameListTest {
	public static void main(String[] args) {
		NameList list = new NameList(6);
		System.out.println(list);
		list.add("홍길동");
		list.add("김길동");
		list.add("홍길동");
		list.add("길동");
		list.add("동");
		
		System.out.println(list); //print는 toString을 내포하고 있음
	}
}
