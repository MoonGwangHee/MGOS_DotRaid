package webapp.mgos.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }


    @GetMapping("/test")
    public String test() {
        return "test";
    }

}
