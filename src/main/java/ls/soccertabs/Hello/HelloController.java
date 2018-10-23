package ls.soccertabs.Hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.spring5.view.ThymeleafView;

@Controller
public class HelloController {
    @Value("${spring.application.name}")
    String appName;

    @RequestMapping("/")
    public String sayHello(Model model){
        model.addAttribute("appName", appName);
        return "index";
    }
}
