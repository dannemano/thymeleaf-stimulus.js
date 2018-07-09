package se.dbot.thymeleafplay.stuff;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EntryController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "you");
        return "index";
    }

}
