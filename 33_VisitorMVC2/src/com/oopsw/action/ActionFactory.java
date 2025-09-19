package com.oopsw.action;

import sun.rmi.log.LogOutputStream;

public class ActionFactory {
	private ActionFactory(){}; //생성자 기본으로 막은 경우가 많음 (=> static으로 사용)
	
	public static Action getAction(String cmd){
		Action a = null;
		//구현부
		switch(cmd){
		case "logoutAction":
			a = new LogoutAction();
			break;
		case "loginAction":
			a = new LoginAction();
			break;
		case "addMemberAction":
			a = new AddMemberAction();
			break;
		case "addMemberUI":
			a = new AddMemberUIAction();
			break;
		case "loginUI":
		case "mainUI":
			a = new LoginUIAction();
			break;
		default:
			a = new LoginUIAction();
		}
		
		return a;
	}
}
