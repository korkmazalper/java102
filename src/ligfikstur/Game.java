package ligfikstur;

public class Game {
    String homeTeam;
    String awayTeam;
    int weekNo;
    int gameNo;

    public Game(String homeTeam, String awayTeam, int weekNo, int gameNo) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.weekNo = weekNo;
        this.gameNo = gameNo;
    }

    public int getWeekNo() {
        return weekNo;
    }

    public void setWeekNo(int weekNo) {
        this.weekNo = weekNo;
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