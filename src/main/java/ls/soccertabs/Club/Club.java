package ls.soccertabs.Club;

import ls.soccertabs.League.League;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Club {
    @Id
    private String id;
    private String name;
    private int points;
    private int goals;
    private int matches;
    @ManyToOne
    private League league;

    public Club(){

    }

    public Club(String id, String name, int points, int goals, int matches, String leagueId) {
        super();
        this.id = id;
        this.name = name;
        this.points = points;
        this.goals = goals;
        this.matches = matches;
        this.league = new League(leagueId, "" , "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }
}
