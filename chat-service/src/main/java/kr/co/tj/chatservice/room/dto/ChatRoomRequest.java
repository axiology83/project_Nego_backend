package kr.co.tj.chatservice.room.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatRoomRequest {



	
	private String title;
	
	private String email1;
	private String email2;
	

}
