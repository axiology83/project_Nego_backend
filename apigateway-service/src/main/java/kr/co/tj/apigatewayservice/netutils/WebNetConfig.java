package kr.co.tj.apigatewayservice.netutils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

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
