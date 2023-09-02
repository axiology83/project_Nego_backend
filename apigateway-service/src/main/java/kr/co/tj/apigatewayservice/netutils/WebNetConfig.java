package kr.co.tj.apigatewayservice.netutils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;


/* user-service쪽에 oauth2 로그인 결과를 보내주고 jwt를 반환 받기 위하여 WebClinet Bean 생성.
 * user-service 컨테이너가 다수 존재할 수 있으므로 로드밸런싱 가능해야함.
 */
@Configuration
public class WebNetConfig {

	@Autowired
	private ReactorLoadBalancerExchangeFilterFunction reactorLoadBalancerExchangeFilterFunction;
	
	
    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder()
                .filter(reactorLoadBalancerExchangeFilterFunction);
    }
}
