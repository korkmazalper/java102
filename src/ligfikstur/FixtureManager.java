package ligfikstur;

import java.util.*;

public class FixtureManager {
    public static void main(String[] args) {
        List<String> playedGames= new ArrayList<>();
        List<Team> teams = new ArrayList<>();
        teams.addAll(createLeageue());
        List<Game> games= new ArrayList<>();
        System.out.println(teams.toString());

        int numberOfWeeks = 2*(teams.size()-1);
        int numberOfWeeklyPlays=teams.size()/2;
        System.out.println("========================================");
        List<Team> weeklyTeams=new ArrayList<>();
        Game tempGame;
        for (int week = 1; week <=numberOfWeeks ; week++) {
             weeklyTeams.addAll( teams);
             int lastGameBugCorrector=0;
            for (int i = 1; i <= numberOfWeeklyPlays ; i++) {
                Team home=chooseATeam(weeklyTeams);
                weeklyTeams.remove(home);
                Team away=chooseATeam(weeklyTeams);
                weeklyTeams.remove(away);
                tempGame=new Game(home.getName(),away.getName(),week,i);
                if(!playedGames.contains(tempGame.toString())){
                    playedGames.add(tempGame.toString());
                    games.add(tempGame);
                } else{
                    lastGameBugCorrector++;
                    weeklyTeams.add(home);
                    weeklyTeams.add(away);
                    i--;
                    if(lastGameBugCorrector>3){
                        playedGames=new ArrayList<>();
                        games=new ArrayList<>();
                        week=1;
                        break;
                    }
                }
                //System.out.println(games.toArray().toString());

            }

        }
        print(games);

    }

    private static List<Team> createLeageue() {
        List<Team> teams=new ArrayList<>();
        teams.add(new Team("Manchester United"));
        teams.add(new Team("Galatasaray"));
        teams.add(new Team("Bayern München"));
        teams.add(new Team("Paris Saint German"));
        teams.add(new Team("Real Madrid"));
        teams.add(new Team("Barcelona"));
        teams.add(new Team("Ajax"));

        if(teams.size()%2!=0){
            teams.add(new Team("Bay"));
        }
        return teams;
    }

    private static void print(List<Game> games) {
        System.out.println("Week" + " " + "Game"+ "\t "+"Home" + " \t\t" + "Away" );
        int previousWeekNo=0;
        if(games!=null){
            for (Game game: games) {
                if(previousWeekNo!=game.getWeekNo()){
                    System.out.println("=================================================");
                    previousWeekNo= game.getWeekNo();
                }
                System.out.println(game.weekNo + "   -   " + game.gameNo+ "  \t "+game.getHomeTeam() + " - " + game.getAwayTeam() );
            }
            System.out.println("=================================================");
        }

    }

    private static Team chooseATeam(List<Team> tteams) {
        if(tteams.size()>0){
            Random r= new Random();
            return tteams.get(r.nextInt(tteams.size()) );
        }
        return null;
    }


}
