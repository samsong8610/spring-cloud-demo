package samsong8610.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import samsong8610.AccountClient;
import samsong8610.RestAccountClient;

/**
 * @author sam
 */
@Configuration
public class BeanConfig {
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public AccountClient accountClient() {
        return new RestAccountClient("http://account-service");
    }
}
