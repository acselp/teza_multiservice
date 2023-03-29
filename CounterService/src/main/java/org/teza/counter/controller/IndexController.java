package org.teza.counter.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/")
@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "This is from counter";
    }

    @GetMapping("/get")
    public String get(int data) {
        return "this is your data :)";
    }
}