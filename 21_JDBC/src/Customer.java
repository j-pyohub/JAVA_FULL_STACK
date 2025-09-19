//표수정
/** 고객 정보를 관리
 * 고객 일련번호, 고객 이름, 핸드폰 번호, 포인트, 가입 날짜 ==> DB table
 */
interface Customer {
	//1. 관리자 입장에서 고객 정보 등록
	boolean setCustomer(String name, String phoneNumber);
	
	//2. 이번에 고객 등록 - 기본 포인트 100
	boolean setCustomer(String name, String phoneNumber, int point);
	
	//3. 특정 고객의 포인트 확인
	int getPoint(int customerId);
	
	//4. 특정 고객의 포인트 수정
	boolean setPoint(int customerId, int point);
	
	//5. 특정 고객의 정보 삭제
	boolean deleteCustomer(int customerId);
}
