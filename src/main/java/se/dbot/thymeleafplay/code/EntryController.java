package se.dbot.thymeleafplay.code;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class EntryController {

    @ModelAttribute("foods")
    public List<String> foods() {
        return Arrays.asList("Gröt", "Glass", "Godis", "Pannkaka");
    }


    @GetMapping("/")
    public String index(Model model,@ModelAttribute("mymodel") MyModel myModel) {
        model.addAttribute("name", "you");
        return "index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("mymodel") MyModel myModel) {
        System.out.println(myModel);
        return "index";
    }
}
