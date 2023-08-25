package kr.co.tj.userservice.toweb;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OAuth2WebRequestFromGateway {
	
	
	private String email;
	private String name;
	private String googleImageUrl;
	
	

}
