package ls.soccertabs.Club;

import ls.soccertabs.League.League;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClubController {
    @Autowired
    private ClubService clubService;

    @RequestMapping("/club/add")
    public String addLeague(Model model){ //public List<League> getAllLeagues(Model model){
        model.addAttribute("club", new Club());
        return "clubform";
    }

    @RequestMapping("/leagues/{id}/clubs")
    public List<Club> getAllClubs(@PathVariable String id){
        return clubService.getAllClubs(id);
    }

    @RequestMapping("/leagues/{leagueId}/clubs/{id}")
    public Club getClub(@PathVariable String id){
        return clubService.getClub(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/leagues/{leagueId}/clubs")
    public void addClub(@RequestBody Club club, @PathVariable String leagueId){
        club.setLeague(new League(leagueId, "", ""));
        clubService.addClub(club);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/leagues/{leagueId}/clubs/{id}")
    public void updateClub(@RequestBody Club club, @PathVariable String leagueId, @PathVariable String id){
        club.setLeague(new League(leagueId, "", ""));
        clubService.updateClub(club);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/leagues/{leagueId/clubs/{id}")
    public void deleteClub(@PathVariable String id){
        clubService.deleteClub(id);
    }
}
