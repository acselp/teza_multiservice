package org.teza.garbage.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/")
public class IndexController {


    @Autowired
    WebClient.Builder webClient;


    @GetMapping("/")
    public String get() throws ExecutionException, InterruptedException {

        ClientResponse res = webClient.build().get()
                .uri("http://localhost:8080/COUNTER-SERVICE")
                .exchange()
                .toFuture()
                .get();

        return res;
    }
}
