package hello.world.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld {

    @GetMapping("/")
    public String posthelloworld()
    {
        return"index";
    }
}
