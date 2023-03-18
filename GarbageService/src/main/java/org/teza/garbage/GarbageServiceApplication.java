package org.teza.garbage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GarbageServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(GarbageServiceApplication.class, args);
    }
}
