package ds.com.notice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoticeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("myName", "이동영");
        return "/index";
    }
}
