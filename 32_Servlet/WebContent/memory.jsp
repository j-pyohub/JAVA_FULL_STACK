<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <h1> tomcat memory</h1>
    <h2> request</h2>
    <%= request.getAttribute("r1") %>
    
    <h2> session</h2>
    <%= session.getAttribute("s1") %>
   
    <h3> 세션 해제</h3>
    <% if(session !=null) session.invalidate(); %>
    
    <h4>application</h4>
    <%= application.getAttribute("info") %>