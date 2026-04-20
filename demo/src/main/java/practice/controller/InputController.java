package practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public String register(InputFormDto inputForm, RedirectAttributes redirectAttributes) {
        // リダイレクト先に一時的にデータを渡して、別リクエストで画面表示
        redirectAttributes.addFlashAttribute("inputForm", inputForm);
        return "redirect:/result/register";
    }

    @GetMapping("/result/register")
    public String showResult(Model model) {
        return "result";
    }
}