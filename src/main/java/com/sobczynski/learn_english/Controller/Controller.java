package com.sobczynski.learn_english.Controller;

import com.sobczynski.learn_english.Service.TranslateService;
import com.sobczynski.learn_english.model.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@org.springframework.stereotype.Controller
public class Controller {
    TranslateService translateService;

    @Autowired
    public Controller(TranslateService translateService) {
        this.translateService = translateService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("rWords",translateService.findRandomWord());
        return "home";
    }

    @GetMapping("/word{id}")
    public String word(Model model, @PathVariable Long id) {
        model.addAttribute("w", translateService.findWordById(id));
        model.addAttribute("rWords", translateService.findRandomWord());
        return "singleWord";
    }

    @PostMapping("/word{id}/updateAnswer")
    public String sAnswer(@ModelAttribute Word editedWord, String answer, @PathVariable Long id) {
        Word word = translateService.findWordById(id);
        word.setAnswer(editedWord.getAnswer());
        translateService.updateAnswer(editedWord, answer);
        return "redirect:/word{id}";
    }
}
