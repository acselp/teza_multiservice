package org.teza.counter.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/counter")
@RestController
public class IndexController {

    @PostMapping("/index")
    public void index(@RequestBody String data) {
        System.out.println("your data" + data);
    }

    @GetMapping("/get")
    public String get(int data) {
        return "this is your data :)";
    }
}