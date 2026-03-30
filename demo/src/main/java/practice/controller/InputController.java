package practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InputController {

    @GetMapping("/input/register")
    public String showForm(Model model) {
        model.addAttribute("inputForm", new InputForm());
        return "register";
    }

    @PostMapping("/result/register")
    public String register(InputForm inputForm, Model model) {
        model.addAttribute("inputForm", inputForm);
        return "result";
    }
}