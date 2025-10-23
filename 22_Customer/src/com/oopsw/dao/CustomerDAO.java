package com.oopsw.dao;

public interface CustomerDAO {
	
/** 1. 관리자 입장에서 고객 정보 등록*/
	boolean addCustomer(String name, String phoneNumber);
	
/** 2. 이번에 고객 등록 - 기본 포인트 100*/
	boolean addCustomer(String name, String phoneNumber, int point);
	
/** 3. 특정 고객의 포인트 확인*/
	int getPoint(int customerId);
	
/**4. 특정 고객의 포인트 수정*/
	boolean updatePoint(int customerId, int newPoint);
	
/**5. 특정 고객의 정보 삭제 */
	boolean deleteCustomer(int customerId);
	
}
