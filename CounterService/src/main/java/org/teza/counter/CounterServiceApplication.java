package org.teza.counter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableDiscoveryClient
@SpringBootApplication
public class CounterServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CounterServiceApplication.class, args);
    }
}
