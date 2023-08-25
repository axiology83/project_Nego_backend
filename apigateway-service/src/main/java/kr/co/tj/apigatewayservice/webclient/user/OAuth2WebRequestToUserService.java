package kr.co.tj.apigatewayservice.webclient.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class OAuth2WebRequestToUserService {
	
	
	private String email;
	private String name;
	private String googleImageUrl;
	
	

}
