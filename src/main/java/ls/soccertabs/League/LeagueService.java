package ls.soccertabs.League;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeagueService {
    @Autowired
    private LeagueRepository leagueRepository;

    public List<League> getAllLeagues(){
        List<League> leagues = new ArrayList<>();
        leagueRepository.findAll().forEach(leagues::add);
        return leagues;
    }

    public void addLeague(League league){
        leagueRepository.save(league);
    }

    public League getLeague(String id){
        return leagueRepository.findById(id).get();
    }

    public void updateLeague(String id, League league){
        leagueRepository.save(league);
    }

    public void deleteLeague(String id){
        leagueRepository.deleteById(id);
    }
}
