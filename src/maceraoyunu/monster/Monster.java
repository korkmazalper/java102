package maceraoyunu.monster;

import maceraoyunu.gametools.Tools;

public class Monster {
    private int id;
    private String name;
    private int health;
    private int damage;
    private int award;
    private  int originalHealth;
    public Monster(int id, String name, int damage, int health, int award) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.originalHealth=health;
        this.damage = damage;
        this.award = award;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health<0){
            health=0;
        }
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    @Override
    public String toString() {
        return Tools.bringClassName(this)+ "{" +
                " name='" + this.name + '\'' +
                ", health= " + this.health +
                ", damage= " + this.damage +
                ", award= " + this.award +
                '}';
    }
}
