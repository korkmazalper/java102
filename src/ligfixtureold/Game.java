<<<<<<<< HEAD:src/ligfiksturenew/Game.java
package ligfiksturenew;
========
package ligfixtureold;
>>>>>>>> 0bfefd87e41caea3083799660d136a8f2b892781:src/ligfixtureold/Game.java

public class Game {
    String homeTeam;
    String awayTeam;
    int weekNo;
    int gameNo;
    static Game gameFactory(String homeTeam, String awayTeam, int weekNo, int gameNo){
        return (!homeTeam.equals(awayTeam))? new Game(homeTeam, awayTeam, weekNo, gameNo):null;
    }
    private Game(String homeTeam, String awayTeam, int weekNo, int gameNo) {
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
