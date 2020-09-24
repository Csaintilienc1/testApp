package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    @GetMapping("/Greeting")
    public String greetingForm(Model model){
        model.addAttribute("greeting", new GreetingController());
        return "Greeting";
    }


    @PostMapping("/greeting")
    public String greetingForm(@ModelAttribute GreetingController Greeting, Model model){
     model.addAttribute("Greeting",Greeting);
        return "Result";
    }
}
