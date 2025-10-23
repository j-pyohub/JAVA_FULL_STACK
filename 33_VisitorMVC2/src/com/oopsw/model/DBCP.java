package com.oopsw.model;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBCP {
	//내 자신을 멤버로 가지는 static 멤버 
	private static DBCP dbcp;
	private static SqlSessionFactory sessionFactory;
	//한번만 올림 -> private
	private DBCP(){
		
	}
	//db 연결하는 connection을 db입장에서는 session이라고 칭함. 그걸 만드는 걸 factory
	public static SqlSessionFactory getSqlSessionFactory(){
		if (dbcp == null)
			dbcp = new DBCP();
		//한번만 만들게 하기  - factory와 builder는 공식처럼 씀 (유지는??)
		if (sessionFactory == null){
			String resource = "config/mybatis-Config.xml";
			try {
				InputStream inputStream;
				inputStream = Resources.getResourceAsStream(resource);
				sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}
