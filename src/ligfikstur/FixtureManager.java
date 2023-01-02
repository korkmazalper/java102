package ligfikstur;

import java.util.*;

public class FixtureManager {
    public static void main(String[] args) {
        List<String> playedGames= new ArrayList<>();
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("Manchester"));
        teams.add(new Team("Galatasaray"));
        teams.add(new Team("Bayern München"));
        teams.add(new Team("Paris Saint German"));
        teams.add(new Team("Ajax"));
        teams.add(new Team("Real Madrid"));
        teams.add(new Team("Barcelona"));
        HashMap<Integer,Integer> weekAndPlay=new HashMap<>();
        List<String> homeAndAway=new ArrayList<>();
        List<Game> games= new ArrayList<>();
        System.out.println(teams.toString());
        if(teams.size()%2!=0){
            teams.add(new Team("Bay"));
        }
        System.out.println(teams.toString());
        int numberOfWeeks=teams.size()-1;
        int numberOfWeeklyPlays=teams.size()/2;
        System.out.println("========================================");
        List<Team> weeklyTeams=new ArrayList<>();
        Game tempGame;
        for (int week = 1; week <=numberOfWeeks ; week++) {
             weeklyTeams.addAll( teams);

            for (int i = 1; i <= numberOfWeeklyPlays ; i++) {
                weekAndPlay.clear();
                homeAndAway.clear();
                Team home=chooseATeam(weeklyTeams);
                weeklyTeams.remove(home);
                Team away=chooseATeam(weeklyTeams);
                weeklyTeams.remove(away);
                tempGame=new Game(home.getName(),away.getName(),week,i);
                if(!playedGames.contains(tempGame.toString())){
                    playedGames.add(tempGame.toString());
                    games.add(tempGame);
                } else{
                    weeklyTeams.add(home);
                    weeklyTeams.add(away);
                    i--;
                }
                //System.out.println(games.toArray().toString());

            }

        }
        print(games);

    }

    private static void print(List<Game> games) {
        System.out.println("Week" + " " + "Game"+ " "+"Home" + " " + "Away" );
        int previousWeekNo=0;
        for (Game game: games) {
            if(previousWeekNo!=game.getWeekNo()){
                System.out.println("=================================================");
                previousWeekNo= game.getWeekNo();
            }
            System.out.println(game.weekNo + " " + game.gameNo+ " "+game.getHomeTeam() + " - " + game.getAwayTeam() );
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
