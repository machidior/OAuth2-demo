package com.machidior.OAuth2_demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuthController {

    @GetMapping("/")
    public String Greet(){
        return "Welcome! I hope you logged in using Google or github!!!";
    }
}
