<<<<<<<< HEAD:src/ligfiksturenew/FixtureManager.java
package ligfiksturenew;
========
package ligfixtureold;
>>>>>>>> 0bfefd87e41caea3083799660d136a8f2b892781:src/ligfixtureold/FixtureManager.java

import java.util.*;

public class FixtureManager {
    public static void main(String[] args) {
        List<String> playedGames= new ArrayList<>();
        List<Game> games= new ArrayList<>();
        List<Team> teams = new ArrayList<>();
        teams.addAll(createLeageue());

        System.out.println(teams.toString());
        int numberOfWeeks = 2*(teams.size()-1);
        int numberOfWeeklyPlays=teams.size()/2;
        System.out.println("========================================");
        List<Team> weeklyTeams=new ArrayList<>();
        Game tempGame;
        System.out.println("The league is randomly created ! Please wait !");
        int i=1;
        for (Team team:teams ) {
           // System.out.println(team + " Home Rivals:"+ team.getHomeRivals().toString());
        }

        for (int week = 1; week <=numberOfWeeks ; week++) {
            weeklyTeams.addAll(teams);
            i=1;
            while (i <= numberOfWeeklyPlays) {
                Team home=chooseATeam(weeklyTeams);
                weeklyTeams.remove(home);
                Team away=chooseATeam(weeklyTeams);

                if(!home.getAwayRivals().contains(away)){
                    tempGame=Game.gameFactory(home.getName(),away.getName(),week,i);
                    if(tempGame!=null){
                        if(!playedGames.contains(tempGame.toString())){
                            playedGames.add(tempGame.toString());
                            games.add(tempGame);
                            home.getAwayRivals().add(away);
                            away.getHomeRivals().add(home);
                            weeklyTeams.remove(away);
                        }

                    }
                }else{
                    i--;
                    weeklyTeams.add(home);
                }


                //System.out.println("home:" + home.toString());

                //tempGame=Game.gameFactory(home.getName(),away.getName(),week,i);
                //if(!playedGames.contains(tempGame.toString())){
                //    playedGames.add(tempGame.toString());
                //    games.add(tempGame);
                //}
                i++;
            }

        }


      /*  for (int week = 1; week <=numberOfWeeks ; week++) {
            weeklyTeams.addAll(teams);
            int lastGameRandomChooseBugCorrector=0;
            for (int i = 1; i <= numberOfWeeklyPlays ; i++) {
                Team home=chooseATeam(weeklyTeams);
                weeklyTeams.remove(home);
                Team away=chooseATeam(weeklyTeams);
                weeklyTeams.remove(away);
                tempGame=Game.gameFactory(home.getName(),away.getName(),week,i);
                if(!playedGames.contains(tempGame.toString())){
                    playedGames.add(tempGame.toString());
                    games.add(tempGame);
                } else{
                    lastGameRandomChooseBugCorrector++;
                    weeklyTeams.add(home);
                    weeklyTeams.add(away);
                    i--;
                    if(lastGameRandomChooseBugCorrector>2){
                        lastGameRandomChooseBugCorrector=0;
                        i=0;


                    }

                }
                //System.out.println(games.toArray().toString());

            }

        }*/
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
        //createRivalArrays(teams);
        return teams;
    }

    private static void createRivalArrays(List<Team> teamss) {
        List<Team> t= new ArrayList<>();
        t=teamss;
        for (Team team: teamss) {
                  team.getAwayRivals().addAll(t);
                  team.getAwayRivals().remove(team);
                  team.getHomeRivals().addAll(t);
                  team.getHomeRivals().remove(team);
        }

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
