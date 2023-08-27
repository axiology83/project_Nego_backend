package kr.co.tj.chatservice.room.service;



import java.util.List;
import java.util.Map;

import kr.co.tj.chatservice.room.dto.ChatRoomDTO;

public interface ChatRoomService {

	ChatRoomDTO insertRoom(String email1, String email2, ChatRoomDTO dto);

	Map<String, Object> enter(String title);

	String delete(String title);

	List<ChatRoomDTO> findRoomsByEmail(String email);



	

}
