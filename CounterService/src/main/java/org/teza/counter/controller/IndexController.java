package org.teza.counter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/counter")
@RestController
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "Index Controlller wooooooorkssss!!!!!!";
    }
}
