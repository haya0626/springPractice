package practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import practice.dto.InputFormDto;

@Controller
public class InputController {

    @GetMapping("/input/register")
    public String showForm(Model model) {
        // model.addAttribute() : コントローラからビューにデータを渡すためのメソッド
        model.addAttribute("inputForm", new InputFormDto());
        return "register";
    }

    @PostMapping("/result/register")
    public String register(InputFormDto inputForm, Model model) {
        model.addAttribute("inputForm", inputForm);
        return "result";
    }
}