package fixturefinale;

import java.util.*;

public class Fixture {
    public static void main(String[] args) {

        List<Team> teams = new ArrayList<>();
        teams.add(new  Team("Real Madrid"));
        teams.add(new  Team("Galatasaray"));
        teams.add(new  Team("Bayern München"));
        teams.add(new  Team("Leipzig"));
        teams.add(new  Team("Manchester United"));
        teams.add(new  Team("Barcelona"));
        teams.add(new  Team("Chelsea"));
        if(teams.size()%2!=0){
            teams.add(new Team("Bay"));
        }
        System.out.println("=========Fixture===================");

        createWeeks(createAllPlays(teams)[0],teams);
        createWeeks(createAllPlays(teams)[1],teams);



    }

    private static void createWeeks(List<Play> allPlays, List<Team> t) {
        List<Week> week=new ArrayList<>();
        List<String> matches=new ArrayList<>();
        int numberOfPlaysInAWeek= t.size()/2;
        List<String> teamsOfTheWeek=new ArrayList<>();
        int numberOfWeeks= (t.size()-1)*2;
        for (int i = 1; i <= numberOfWeeks ; i++) {
            teamsOfTheWeek.clear();
            System.out.println("============================================");
            for (int j = 1; j <= numberOfPlaysInAWeek; j++) {
                for (int k = 0; k < allPlays.size(); k++) {
                    if(!teamsOfTheWeek.contains(allPlays.get(k).getHomeTeam()) && !teamsOfTheWeek.contains(allPlays.get(k).getAwayTeam())){
                        System.out.println(i + "-"+allPlays.get(k).getHomeTeam()+ " - " + allPlays.get(k).getAwayTeam());
                        teamsOfTheWeek.add(allPlays.get(k).getAwayTeam());
                        teamsOfTheWeek.add(allPlays.get(k).getHomeTeam());
                        week.add(new Week(i,allPlays.get(k)));
                        allPlays.remove(k);
                        break;
                    }
                }

            }

        }
    }
    public static List<Play>[] createAllPlays(List<Team> teams){
        List<Play> firstTerm = new ArrayList<>();
        List<Play> secondTerm = new ArrayList<>();
        showList(teams);
        for (int i = 0; i <teams.size()-1 ; i++) {
            for (int j = i+1; j <teams.size() ; j++) {
                firstTerm.add(new Play(teams.get(i).getName(),teams.get(j).getName()));
                secondTerm.add(new Play(teams.get(j).getName(),teams.get(i).getName()));
            }
        }
        showList(firstTerm);
        showList(secondTerm);
        List<Play>[] arr= new List[2];

        arr[0]=firstTerm;
        arr[1]=secondTerm;
       return  arr;
    }



    public  static <T> void showList(List<T> t){
        System.out.println(t.toString());

    }
}
