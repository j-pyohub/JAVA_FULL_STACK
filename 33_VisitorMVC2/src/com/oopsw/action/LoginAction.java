package com.oopsw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.oopsw.model.LoginDAO;
import com.oopsw.model.MemberDAO;
import com.oopsw.model.MemberVO;

public class LoginAction implements Action{

	@Override
	public String execute(HttpServletRequest request) throws ServletException, IOException {
		String url = "login.html";
		
		String memberId = request.getParameter("memberId");
		String pw = request.getParameter("pw");
		
		//try{
			//String resultName = new MemberDAO().login(memberId, pw);
			String resultName = new LoginDAO().loginMybatis(new MemberVO(memberId, pw, null));
			if (resultName != null){
				HttpSession session = request.getSession(true);
				//로그인 상태 체크, 기타 필요한 정보 저장
				session.setAttribute("loginOK", memberId); //primary key로 로그인 체크
				session.setAttribute("loginName", resultName);
				//session.setAttribute("info", new MemberVO(memberId, resultName)); => 한번에 collection으로 넣어도 됨
				
				//방명록 목록 미리 메모리에 등록
				request.setAttribute("visitors", new LoginDAO().getVisitors());
				
				
				url = "getVisitors.jsp";
			}
//		} 
//			catch(Exception e){
//			e.printStackTrace();
//		}
		
		return url;

	}
	
}
