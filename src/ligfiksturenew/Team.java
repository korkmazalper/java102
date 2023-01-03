package ligfiksturenew;

import java.util.ArrayList;
import java.util.List;

public class Team {
    String name;
    List<Team> homeRivals=new ArrayList<>();
    List<Team> awayRivals=new ArrayList<>();

    public List<Team> getHomeRivals() {
        return homeRivals;
    }

    public void setHomeRivals(List<Team> homeRivals) {
        this.homeRivals = homeRivals;
    }

    public List<Team> getAwayRivals() {
        return awayRivals;
    }

    public void setAwayRivals(List<Team> awayRivals) {
        this.awayRivals = awayRivals;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
