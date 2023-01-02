package ligfiksturold;

import java.util.HashSet;

public class Team {
    String name;
    HashSet<String> playedGamesHome;
    HashSet<String> playedGamesAway;

    public void addPlayedGamesHome(String s){
        playedGamesHome.add(s);
    }
    public void addPlayedGamesAway(String s){
        playedGamesAway.add(s);
    }
    public HashSet<String> getPlayedGamesHome() {
        return playedGamesHome;
    }

    public void setPlayedGamesHome(HashSet<String> playedGamesHome) {
        this.playedGamesHome = playedGamesHome;
    }

    public HashSet<String> getPlayedGamesAway() {
        return playedGamesAway;
    }

    public void setPlayedGamesAway(HashSet<String> playedGamesAway) {
        this.playedGamesAway = playedGamesAway;
    }

    public String getName() {
        return name;
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
