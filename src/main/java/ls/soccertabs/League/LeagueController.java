package ls.soccertabs.League;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LeagueController {

    @Autowired
    private LeagueService leagueService;

    @RequestMapping("/leagues")
    public List<League> getAllLeagues(){
        return leagueService.getAllLeagues();
    }

    @RequestMapping("/leagues/{id}")
    public League getLeague(@PathVariable String id){
        return leagueService.getLeague(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/leagues")
    public void addLeague(@RequestBody League league){
        leagueService.addLeague(league);
    }

    //method written to use the form for adding leagues to the database
    @RequestMapping(method = RequestMethod.POST, value = "/leagues/add",consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public void addLeague2(League league){
        leagueService.addLeague(league);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/leagues/{id}")
    public void updateLeague(@RequestBody League league, @PathVariable String id){
        leagueService.updateLeague(id, league);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/leagues/{id}")
    public void deleteLeague(@PathVariable String id){
        leagueService.deleteLeague(id);
    }
}
