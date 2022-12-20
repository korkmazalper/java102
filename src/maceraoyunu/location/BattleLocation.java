package maceraoyunu.location;

import maceraoyunu.Player;
import maceraoyunu.gametools.Tools;
import maceraoyunu.inventory.Armor;
import maceraoyunu.inventory.Weapon;
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
        if(!this.isConquered()){
            System.out.println("Look out! The following monsters are living here: "+ this.getNumberOfMonsters()+" " +Tools.bringClassName(this.monster) + "(s)" );
            System.out.println("<F>ight or <R>un away !");
            String selection=sc.nextLine();
            selection=selection.toUpperCase();
            if("F".equals(selection)){
                System.out.println("The battle starts ...");
                if(combat(this.getNumberOfMonsters())){
                    System.out.println(this.getName() + " is now clear!");
                    //this.setConquered(true);
                    this.getPlayer().addToConqueredRegions(this.name);
                    if(this.getMonster().getName().equals("Snake")){
                        bringRandomAward();
                    }
                    this.getPlayer().getInventory().addToAwards(this.getAward());
                    return true;
                }
            }
            if(this.getPlayer().getHealth()<=0){
                System.out.println(" You died !");
                return false;
            }
        } else{
            System.out.println("This region is conquered. Go back !");
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

                        int damagee=this.getPlayer().getInventory().getArmor().getBlock()-this.getMonster().getDamage();
                        if(damagee<0){
                            damagee=0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth()-damagee);

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
                if(!this.getMonster().getName().equals("Snake")){
                    System.out.println("You killed all the monsters !");
                    System.out.println("You won "+this.getMonster().getAward() + " money");
                    this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getMonster().getAward());
                    System.out.println("Your actual money: " + this.getPlayer().getMoney());
                } else{

                }


            } else{
                return false;
            }

        }
        return true;
    }

    private void bringRandomAward() {
        double randomNumber= Tools.chanceRandomizer(0,1);

        if(randomNumber<0.45){
            System.out.println("--->You got nothing ! <---");
        }else if(randomNumber<0.70){
            System.out.println("--->You got some money !<---");
            this.getPlayer().setMoney(this.getPlayer().getMoney()+bringRandomMoney());
        }else if(randomNumber<0.85){
            System.out.println("--->You got Armor !<---");
            this.getPlayer().getInventory().addToInventoryList(bringRandomArmor());
        } else if(randomNumber<=1){
            System.out.println("--->You got Weapon !<---");
            this.getPlayer().getInventory().addToInventoryList(bringRandomWeapon());
        }
    }

    private Weapon bringRandomWeapon() {
        double randomized=Tools.chanceRandomizer(0,1);
        if(randomized<0.50){
            return new Weapon(1, "Light", 2, 1);
        }else if(randomized<0.80){
            return new Weapon(2,"Middle" , 3, 3);
        } else if(randomized<=1){
            return new Weapon(3, "Heavy", 7, 5);
        }
        return null;
    }

    private Armor bringRandomArmor() {
        double randomized=Tools.chanceRandomizer(0,1);
        if(randomized<0.50){
            return new Armor(1, "Light", 2, 1);
        }else if(randomized<0.80){
            return new Armor(2,"Middle" , 3, 3);
        } else if(randomized<=1){
            return new Armor(3, "Heavy", 7, 5);
        }
        return null;
    }

    private int bringRandomMoney() {
        int randomMoney;
        double randomized=Tools.chanceRandomizer(0,1);
        if(randomized<0.50){
            randomMoney=1;
        }else if(randomized<0.80){
            randomMoney=5;
        }else{
            randomMoney=10;
        }
        return randomMoney;
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
