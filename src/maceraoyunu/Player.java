package maceraoyunu;

import maceraoyunu.characters.GameCharacter;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String charName;
    private String name;
    final GameCharacter gameCharacter;

    public Player(String name, GameCharacter gameCharacter){
        this.name= name;
        this.gameCharacter = gameCharacter;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
