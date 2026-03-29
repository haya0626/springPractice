package practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InputController {

    @GetMapping("/input/register")
    public String showForm(Model model) {
        model.addAttribute("inputForm", new InputForm());
        return "register";
    }
}