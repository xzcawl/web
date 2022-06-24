package org.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TokeController {
    @GetMapping("/index")
    public String index() {
        return "hello";
    }

    @GetMapping("/token")
    public String token() {
        return "redirect:/token.html";
    }

}
