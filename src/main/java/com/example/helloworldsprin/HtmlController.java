package com.example.helloworldsprin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller
public class HtmlController   {
    @Autowired
    private hello h;
    @GetMapping("/index")
    public String exempleHTML(Model model) {
        String m=h.greet();
        String message = "Bienvenue sur notre site Spring Boot html controller!"+m;

        model.addAttribute("msg", message);
        model.addAttribute("m",m);

        return "index"; // Cela renverra le fichier "index.html" depuis le répertoire de templates
    }
    ////test pour styler la fct greet()
    @GetMapping("/i")
    public String ex(Model model) {
        String mm=h.greet();
        model.addAttribute("m",mm);

        return "i";
    }

}
