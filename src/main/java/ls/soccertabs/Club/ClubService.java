package ls.soccertabs.Club;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class ClubService {
    @Autowired
    private ClubRepository clubRepository;

    public List<Club> getAllClubs(String id){
        List<Club> clubs = new ArrayList<>();
        clubRepository.findByLeagueId(id).forEach(clubs::add);
        return clubs;
    }

    public Club getClub(String id){
        return clubRepository.findById(id).get();
    }

    public void addClub(Club club){
        clubRepository.save(club);
    }

    public void updateClub(Club club){
        clubRepository.save(club);
    }

    public void deleteClub(String id){
        clubRepository.deleteById(id);
    }
}
