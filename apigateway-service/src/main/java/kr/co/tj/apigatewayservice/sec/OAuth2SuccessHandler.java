package kr.co.tj.apigatewayservice.sec;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.server.WebFilterExchange;
import org.springframework.security.web.server.authentication.ServerAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import kr.co.tj.apigatewayservice.webclient.user.OAuth2WebRequestToUserService;
import kr.co.tj.apigatewayservice.webclient.user.OAuth2WebResponseFromUserService;
import reactor.core.publisher.Mono;

@Component
public class OAuth2SuccessHandler implements ServerAuthenticationSuccessHandler{
	
	private WebClient.Builder webClientBuilder;
	
	@Autowired
	public OAuth2SuccessHandler(WebClient.Builder webClientBuilder) {
		this.webClientBuilder = webClientBuilder;
	}

	


	@Override
	public Mono<Void> onAuthenticationSuccess(WebFilterExchange webFilterExchange, Authentication authentication) {
	    OAuth2User oAuth2User = (OAuth2User) authentication.getPrincipal();
	    
	    String email = (String) oAuth2User.getAttributes().get("email");
	    String name = (String) oAuth2User.getAttributes().get("name");
	    String googleImageUrl = (String) oAuth2User.getAttributes().get("picture");
	    
	    OAuth2WebRequestToUserService oAuth2WebRequestToUserService = OAuth2WebRequestToUserService.builder()
	            .email(email)
	            .name(name)
	            .googleImageUrl(googleImageUrl)
	            .build();
	    
	    WebClient webClient = webClientBuilder.baseUrl("http://USER-SERVICE/").build();
	    
	    return webClient.post()
	        .uri("/user-service/gateway-users/oauth2/signupandlogin")
	        .body(Mono.just(oAuth2WebRequestToUserService), OAuth2WebRequestToUserService.class)
	        .retrieve()
	        .bodyToMono(OAuth2WebResponseFromUserService.class)
	        .flatMap(oAuth2WebResponseFromUserService -> {
	            System.out.println("Response Body" + oAuth2WebResponseFromUserService);
	            ServerHttpResponse response = webFilterExchange.getExchange().getResponse();
	            response.setStatusCode(HttpStatus.OK);
	            DataBuffer buffer = response.bufferFactory().wrap(oAuth2WebResponseFromUserService.getTestresult().getBytes());
	            return response.writeWith(Mono.just(buffer));
	        });
        
        				
	} 
        		

        
     

       
             
	
    
}

