package kr.co.tj.userservice.info.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
/* class for update user Information */
public class UserInfoRequest{
	
	private String email;
	
	private String password;
	private String password2;
	private String orgPassword;
	private String name;
	
	private Double longitude;
	private Double latitude;
	

	
}
