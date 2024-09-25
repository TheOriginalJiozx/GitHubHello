package githubhello.githubhello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
}