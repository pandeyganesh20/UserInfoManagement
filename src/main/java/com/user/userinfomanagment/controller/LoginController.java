package com.user.userinfomanagment.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class LoginController {

        @GetMapping("/home")
        public String getHomePage() {
            return "home";
        }

        @GetMapping("/login")
        public String getLoginPage() {
            return "login";
        }

        @Controller
        public static class HelloController {

            @GetMapping("/greet")
            public String sayHello()
            {
                return "hello";
            }
        }
    }


