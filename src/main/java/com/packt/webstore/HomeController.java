package com.packt.webstore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcome(Model model) {
//        model.addAttribute("greeting", "Welcome to Web Store!");
//        model.addAttribute("tagline", "The one and only amazing store");

        return "index";
    }

    @RequestMapping("/garg")
    public String welcome2(Model model) {
        model.addAttribute("greeting", "Goldmann Wala Launda!");
        model.addAttribute("tagline", "garg");

        return "welcome";
    }

}
