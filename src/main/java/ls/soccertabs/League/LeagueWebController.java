package ls.soccertabs.League;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LeagueWebController {
    @Autowired
    private LeagueService leagueService;

    @RequestMapping("/leagues/show")
    public String getAllLeagues(Model model){
        model.addAttribute("leagues", leagueService.getAllLeagues());
        return "league";
    }

    @RequestMapping("/leagues/add")
    public String addLeague(Model model){
        model.addAttribute("league", new League());
        return "leagueform";
    }
}
