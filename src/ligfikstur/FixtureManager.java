package ligfikstur;

import java.util.*;

public class FixtureManager {
    public static void main(String[] args) {

        List<Team> teams = new ArrayList<>();
        teams.add(new Team("Galatasaray"));
        teams.add(new Team("Besiktas"));
        teams.add(new Team("Adana DS"));
        teams.add(new Team("Bursaspor"));
        teams.add(new Team("Altay"));
        teams.add(new Team("Real Madrid"));
        teams.add(new Team("Barcelona"));
        HashMap<Integer,Integer> weekAndPlay=new HashMap<>();
        HashMap<Team,Team> homeAndAway=new HashMap<>();
        HashMap<HashMap<Integer,Integer>,HashMap<Team,Team>> plays= new HashMap<>();
        System.out.println(teams.toString());
        if(teams.size()%2!=0){
            teams.add(new Team("Bay"));
        }
        System.out.println(teams.toString());
        int numberOfWeeks=teams.size()-1;
        int numberOfWeeklyPlays=teams.size()/2;
        System.out.println("========================================");
        List<Team> weeklyTeams=new ArrayList<>();
        for (int week = 1; week <=numberOfWeeks ; week++) {
             weeklyTeams.addAll( teams);

            for (int i = 1; i <= numberOfWeeklyPlays ; i++) {
                weekAndPlay.clear();
                homeAndAway.clear();
                Team home=chooseATeam(weeklyTeams);
                weeklyTeams.remove(home);
                Team away=chooseATeam(weeklyTeams);
                weeklyTeams.remove(away);
                weekAndPlay.put(week,i);
                homeAndAway.put(home,away);
                plays.put(weekAndPlay,homeAndAway);
            }

        }

        System.out.println(plays.values().toString());

    }

    private static Team chooseATeam(List<Team> tteams) {
        if(tteams.size()>0){
            Random r= new Random();
            return tteams.get(r.nextInt(tteams.size()) );
        }
        return null;
    }


}
