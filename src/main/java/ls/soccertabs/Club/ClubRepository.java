package ls.soccertabs.Club;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClubRepository extends CrudRepository<Club, String> {
    public List<Club> findByLeagueId(String leagueId);
}
