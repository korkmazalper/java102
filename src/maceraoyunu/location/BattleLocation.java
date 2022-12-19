package maceraoyunu.location;

import maceraoyunu.Player;
import maceraoyunu.gametools.Tools;
import maceraoyunu.monster.Monster;

import java.util.Locale;
import java.util.Random;

public abstract class BattleLocation extends Location {
    private Monster monster;

    private int maxMonster;
    public BattleLocation(Player p1, String name, Monster monster, String award, int maxMonster) {
        super(p1, name);
        this.monster=monster;
        this.award=award;
        this.maxMonster=maxMonster;
    }
    @Override
    public boolean onLocation() {
        System.out.println("Your are in " + this.name + " now!");
        System.out.println("Look out! The following monsters are living here: "+ this.numberOfMonsters()+" " +Tools.bringClassName(this.monster) + "(s)" );
        System.out.println("<F>ight or <R>un away !");
       String selection=sc.nextLine();
       selection=selection.toUpperCase();
        if("F".equals(selection)){
            System.out.println("The battle starts ...");
        }
        return true;
    }

    private int numberOfMonsters() {
        Random r= new Random();
        return 1+r.nextInt(this.getMaxMonster());
    }


    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

     public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }
}
