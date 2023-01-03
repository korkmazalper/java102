package ligfixturenewest;

public class Game {
    String homeTeam;
    String awayTeam;
    int weekNo;
    int gameNo;
    static Game gameFactory(String homeTeam, String awayTeam){
        return (!homeTeam.equals(awayTeam))? new Game(homeTeam, awayTeam):null;
    }
    private Game(String homeTeam, String awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;

    }

    public Game(String homeTeam, String awayTeam, int weekNo, int gameNo) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.weekNo = weekNo;
        this.gameNo = gameNo;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    @Override
    public String toString() {
        return  homeTeam + " - " + awayTeam;
    }
}
