package samsong8610;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author sam
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServer {
    public static void main(String[] args) {
        System.setProperty("spring.config.name", "config-server");
        SpringApplication.run(ConfigServer.class, args);
    }
}
