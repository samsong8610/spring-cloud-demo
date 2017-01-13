package samsong8610;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author sam
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AccountService {
    public static void main(String[] args) {
        System.setProperty("spring.config.name", "account-service");
        SpringApplication.run(AccountService.class, args);
    }
}
