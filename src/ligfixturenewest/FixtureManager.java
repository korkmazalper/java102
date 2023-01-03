package ligfixturenewest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FixtureManager {
    static List<String> allPlayedGames=new ArrayList<>();
    public static void main(String[] args) {
        List<String> playedGames= new ArrayList<>();
        List<Team> teams = new ArrayList<>();
        teams.addAll(createLeague());
        int numberOfWeeks = 2*(teams.size()-1);
        System.out.println(teams.toString());

        System.out.println("========================================");

        List<Game> games=createAllPossibleGames(teams);

        for (int week = 1; week <=numberOfWeeks ; week++) {

            bringWeek(teams,games,week);


        }

       print(games);

    }

    private static List<Game> bringWeek(List<Team> teams, List<Game> games, int week) {
        int i=1;
        List<String> weeklyPlayedTeams=new ArrayList<>();
        List<Game> weeklyPlayedGames=new ArrayList<>();
        Game randomlyChoosenGame;
        int numberOfWeeklyPlays=teams.size()/2;

        while (i <= numberOfWeeklyPlays) {
            randomlyChoosenGame = chooseFromTheList(games);
            if(!(weeklyPlayedTeams.contains(randomlyChoosenGame.homeTeam) || weeklyPlayedTeams.contains(randomlyChoosenGame.awayTeam))){


                weeklyPlayedTeams.add(randomlyChoosenGame.awayTeam);
                weeklyPlayedTeams.add(randomlyChoosenGame.homeTeam);

                weeklyPlayedGames.add(new Game(randomlyChoosenGame.getHomeTeam(), randomlyChoosenGame.getAwayTeam(),week, i));
                System.out.println( week+" "+ i + " "+ randomlyChoosenGame.homeTeam + " - " +randomlyChoosenGame.awayTeam);
                games.remove(randomlyChoosenGame);
                i++;
            }else{

            }



        }
        return weeklyPlayedGames;
    }

    private static List<Game> createAllPossibleGames(List<Team> teams) {
        List<Game> games=new ArrayList<>();
        for (Team team: teams ) {
            for (Team t: teams ) {
                if(!team.equals(t)){
                    games.add(Game.gameFactory(team.getName(),t.getName()));
                }
            }
        }
        return games;
    }


    private static List<Team> createLeague() {
        List<Team> teams=new ArrayList<>();
        teams.add(new Team("Manchester United"));
        teams.add(new Team("Galatasaray"));
        teams.add(new Team("Bayern München"));
        teams.add(new Team("Paris Saint German"));
        teams.add(new Team("Real Madrid"));
        teams.add(new Team("Barcelona"));
        teams.add(new Team("Ajax"));
        teams.add(new Team("Fiorentina"));

        if(teams.size()%2!=0){
            teams.add(new Team("Bay"));
        }
        //createRivalArrays(teams);
        return teams;
    }



   private static void print(List<Game> games) {
        System.out.println("Week" + " " + "Game"+ "\t "+"Home" + " \t\t" + "Away" );
        int previousWeekNo=0;
        if(games!=null){
            for (Game game: games) {

                System.out.println(game.getHomeTeam() + " - " + game.getAwayTeam() );
            }
            System.out.println("=================================================");
        }

    }

    private static <T> T chooseFromTheList(List<T> list) {
        if(list.size()>0){
            Random r= new Random();
            return list.get(r.nextInt(list.size()) );
        }
        return null;
    }


}
