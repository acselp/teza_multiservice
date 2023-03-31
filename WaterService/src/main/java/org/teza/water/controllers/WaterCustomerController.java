package org.teza.water.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.teza.water.models.User;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/water_customer")
public class WaterCustomerController {

    private WebClient _webClient;

    @GetMapping("/users")
    public Iterable<User> test() {
        Iterable<User> users = (Iterable<User>) _webClient.get()
                .uri("http://localhost:8085/users/all")
                .retrieve()
                .bodyToMono(User.class)
                .block();

        return users;
    }
}
