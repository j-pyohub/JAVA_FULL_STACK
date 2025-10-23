package com.oopsw.domitory;

import java.util.Collection;

public interface RoomDAO {
	/**호실 조회*/
	Collection<RoomVO> getRoomFloor(int floor);
	Collection<Integer> getRoomType(int floor, int roomType);
	Collection<String> getRoomStudent(int roomNumber);
	
	/**특정 호실 정보 조회*/
	Collection<StudentVO> searchRoomStudent(int roomNumber);
	int countRoomStudent(int roomNumber);
	
	/**호실 배정*/
	Collection<StudentVO> searchNoRoomStudent(String name);
	
}
