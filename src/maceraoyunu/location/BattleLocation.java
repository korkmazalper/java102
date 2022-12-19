package maceraoyunu.location;

import maceraoyunu.Player;
import maceraoyunu.gametools.Tools;
import maceraoyunu.monster.Monster;

import java.util.Random;

public abstract class BattleLocation extends Location {
    private Monster monster;
    private int maxMonster;
    private int numberOfMonsters;

    public BattleLocation(Player p1, String name, Monster monster, String award, int maxMonster) {
        super(p1, name);
        this.monster=monster;
        this.award=award;
        this.maxMonster=maxMonster;
        this.numberOfMonsters=createNumberOfMonsters();
    }
    @Override
    public boolean onLocation() {
        System.out.println("Your are in " + this.name + " now!");
        System.out.println("Look out! The following monsters are living here: "+ this.getNumberOfMonsters()+" " +Tools.bringClassName(this.monster) + "(s)" );
        System.out.println("<F>ight or <R>un away !");
       String selection=sc.nextLine();
       selection=selection.toUpperCase();
        if("F".equals(selection)){
            System.out.println("The battle starts ...");
            if(combat(this.getNumberOfMonsters())){
                System.out.println(this.getName() + " is now clear!");
                return true;
            }
        }
        if(this.getPlayer().getHealth()<=0){
            System.out.println(" You died !");
            return false;
        }
        return true;
    }

    private boolean combat(int numberOfMonsters) {
        for (int i = 1; i <=numberOfMonsters ; i++) {

            this.monster.setHealth(this.monster.getOriginalHealth());
            playerStatistics();
            monsterStatistics(i);
            while(this.getPlayer().getHealth()>0 && this.getMonster().getHealth()>0){
                System.out.print("<H>it or <R>un away !");
                String selectCombat = sc.nextLine().toUpperCase();
                if("H".equals(selectCombat)){
                    System.out.println("You hit !");
                    this.getMonster().setHealth(this.monster.getHealth()-this.getPlayer().getTotalDamage());
                    afterHit();
                    if(this.getMonster().getHealth()>0){
                        System.out.println(this.getMonster().getName() + " hits you !");
                        int totalDamagee=this.getMonster().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
                        System.out.println("total damage=" + totalDamagee);
                        if(totalDamagee<0){
                            totalDamagee=0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth()-totalDamagee);
                        afterHit();
                    }
                } else{
                    return false;
                }
            }
            if(this.getMonster().getHealth()<this.getPlayer().getHealth()){
                System.out.println("You killed all the monsters !");
                System.out.println("You won "+this.getMonster().getAward() + " money");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getMonster().getAward());
                System.out.println("Your actual money: " + this.getPlayer().getMoney());
            } else{
                return false;
            }

        }
        return true;
    }

    private void afterHit() {
        System.out.println("Actual Health Statistics");
        System.out.println("--------------------------------");
        System.out.println("The Health of the player: " + this.getPlayer().getHealth());
        System.out.println("The health of the actual monster: " + this.getMonster().getHealth());
        System.out.println("*************************************");
    }

    private void monsterStatistics(int i) {
        System.out.println(i + ".Monster Statistics");
        System.out.println("--------------------------");
        System.out.println(this.monster.toString());
    }

    private void playerStatistics() {
        System.out.println("Player Statistics");
        System.out.println("--------------------------");
        System.out.println(this.player.toString());
    }

    private int createNumberOfMonsters() {
        Random r= new Random();
        return 1+r.nextInt(this.getMaxMonster());
    }

    public int getNumberOfMonsters() {
        return numberOfMonsters;
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
