package ls.soccertabs.Club;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClubWebController {
    @Autowired
    private ClubService clubService;

    @RequestMapping("/clubs/show")
    public String getAllClubs(Model model){
        model.addAttribute("clubs", clubService.getAllClubs("PL"));
        return "club";
    }

}
