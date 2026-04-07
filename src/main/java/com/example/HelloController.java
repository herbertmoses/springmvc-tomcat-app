package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class HelloController {

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    @PostMapping("/submit")
    public String submit(@Valid @ModelAttribute("user") User user,
                         BindingResult result,
                         Model model) {

        if (result.hasErrors()) {
            return "form"; // back to form with errors
        }

        model.addAttribute("message",
                "Welcome " + user.getName() + " (" + user.getEmail() + ")");
        return "result";
    }
}