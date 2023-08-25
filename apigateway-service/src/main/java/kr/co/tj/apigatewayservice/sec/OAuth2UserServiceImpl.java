package kr.co.tj.apigatewayservice.sec;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
public class OAuth2UserServiceImpl extends DefaultOAuth2UserService{
	

	
//	@Autowired
//	private UserInfoRepository userInfoRepository;
	
	@Override
	public OAuth2User loadUser(OAuth2UserRequest oa2Request) {
		final OAuth2User oAuth2User = super.loadUser(oa2Request);
		//saveOrUpdate(oAuth2User);
		System.out.println("테스트 중입니다!!!!!!!!!!");
		System.out.println("테스트 중입니다!!!!!!!!!!");
		System.out.println("테스트 중입니다!!!!!!!!!!");
		System.out.println("테스트 중입니다!!!!!!!!!!");
		System.out.println("테스트 중입니다!!!!!!!!!!");

		
		return oAuth2User;
	}
	
//	private UserInfoEntity saveOrUpdate(OAuth2User oAuth2User) {
//		Map<String, Object> googleData = oAuth2User.getAttributes();
//		String email = (String) googleData.get("email");
//		String name = (String) googleData.get("name");
//		String googleImageUrl = (String) googleData.get("picture");
//		
//		System.out.println(email + name + googleImageUrl);
//		
//		Optional<UserInfoEntity> optional = userInfoRepository.findByEmail(email);
//		
//		
//		if (!optional.isPresent()) {
//			UserInfoEntity entity = UserInfoEntity.builder()
//			.google(true)
//			.email(email)
//			.name(name)
//			.googleImageUrl(googleImageUrl)
//			.build();
//			log.info("Successfully pulled user info email {} name {} googleImageUrl {}", email, name, googleImageUrl );
//			return userInfoRepository.save(entity);
//		}
//		
//		UserInfoEntity orgEntity = optional.get();
//		UserInfoEntity entity = UserInfoEntity.builder()
//				.google(true)
//				.email(orgEntity.getEmail())
//				.name(name)
//				.googleImageUrl(googleImageUrl)
//				.build();
//		
//		log.info("Successfully pulled user info email {} name {} googleImageUrl {}", email, name, googleImageUrl );
//		return userInfoRepository.save(entity);
//		
//	}
//	

}
