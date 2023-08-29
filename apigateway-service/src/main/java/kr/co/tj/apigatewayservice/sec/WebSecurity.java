package kr.co.tj.apigatewayservice.sec;

import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.client.userinfo.DefaultReactiveOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.client.userinfo.ReactiveOAuth2UserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.server.SecurityWebFilterChain;

import reactor.core.publisher.Mono;


@Configuration
@EnableWebFluxSecurity
public class WebSecurity {
	
	private OAuth2SuccessHandler oAuth2SuccessHandler;
	
	
	
	@Autowired
	public WebSecurity(OAuth2SuccessHandler oAuth2SuccessHandler) {
		super();
		this.oAuth2SuccessHandler = oAuth2SuccessHandler;
	}



/* 필터는 임시로 무효 처리
	@Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) throws Exception{
        
		http
		    .csrf()
		    .disable()
            .authorizeExchange()
//            .pathMatchers("/o/oauth2/auth").authenticated()
            .anyExchange().permitAll()
//            .pathMatchers("/**").permitAll()
//            .anyExchange().authenticated()
            .and()
            .oauth2Login()
            .authenticationSuccessHandler(oAuth2SuccessHandler);
  	
        return http.build();
    }
	
	*/
	
	
//	@Bean
//	public ReactiveOAuth2UserService<OAuth2UserRequest, OAuth2User> reactiveOAuth2UserService() {
//	    return new ReactiveOAuth2UserService<OAuth2UserRequest, OAuth2User>() {
//	        
//	    	@Override
//	        public Mono<OAuth2User> loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
//	            DefaultReactiveOAuth2UserService oAuth2UserService = new DefaultReactiveOAuth2UserService();
//	            return oAuth2UserService.loadUser(userRequest).map(new Function<OAuth2User, OAuth2User>() {
//	                @Override
//	                public OAuth2User apply(OAuth2User user) {
//	                	
//	                	Map<String, Object> userAttributes = user.getAttributes();
//	                	
//	                	
//	                    System.out.println("테스트 테스트 테스트");
//	                    System.out.println("테스트 테스트 테스트");
//
//	                    
//	                    System.out.println("테스트 테스트 테스트");
//	                    System.out.println("테스트 테스트 테스트");
//	                    
//	                    System.out.println((String) userAttributes.get("email"));
//	                    System.out.println((String) userAttributes.get("email"));
//	                    System.out.println((String) userAttributes.get("email"));
//
//	                    System.out.println((String) userAttributes.get("email"));
//
//	                    System.out.println((String) userAttributes.get("name"));
//	                    System.out.println((String) userAttributes.get("name"));
//	                    System.out.println((String) userAttributes.get("name"));
//
//
//	                    return user;
//	                    
//	                }
//	            });
//	        }
//	    };
//	}
//
//	
//	
//	
	
	
	/*
	 * @Bean public ReactiveOAuth2UserService<OAuth2UserRequest, OAuth2User>
	 * oAuth2UserService() { return request -> { DefaultReactiveOAuth2UserService
	 * oAuth2UserService = new DefaultReactiveOAuth2UserService(); return
	 * oAuth2UserService.loadUser(request).map(user -> { // 사용자 정보 처리 로직 return
	 * user; }); }; }
	 */
		
	
		
}
