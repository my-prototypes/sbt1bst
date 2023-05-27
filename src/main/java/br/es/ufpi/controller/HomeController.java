package br.es.ufpi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController{
    @GetMapping("/")
    public String bemVindo(){
        return "index";
    }
}