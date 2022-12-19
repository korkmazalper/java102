package maceraoyunu;

import maceraoyunu.characters.Archer;
import maceraoyunu.characters.GameCharacter;
import maceraoyunu.characters.Paladin;
import maceraoyunu.characters.Samurai;
import maceraoyunu.inventory.Inventory;
import maceraoyunu.location.*;

import java.util.Scanner;

public class Player {
    static Scanner sc = new Scanner(System.in);
    final GameCharacter gameCharacter;
    private int damage;
    private int health;
    private int money;
    private String charName;
    private String name;
    private Location activeLocation;
    private Inventory inventory;

    public Player(String name, GameCharacter gameCharacter) {
        this.name = name;
        this.gameCharacter = gameCharacter;
        this.damage= gameCharacter.getDamage();
        this.money= gameCharacter.getMoney();
        this.health= gameCharacter.getHealth();
        this.inventory= new Inventory();
    }

    public static Player createPlayer() {
        Player player1;
        GameCharacter[] gc = {new Samurai(5, 21, 15), new Archer(7, 18, 20), new Paladin(8, 24, 5)};
        System.out.println("------------------------------------------------");
        for (GameCharacter gamecharacter : gc) {
            System.out.println("|" + gamecharacter + "                           |");
        }
        System.out.println("------------------------------------------------");
        //System.out.print("Input your name:");
        //String nameOfPlayer=sc.next();
        String nameOfPlayer = "NinjaMatix";
        System.out.print("Select your Character (1-Samurai-2-Archer-3-Paladin):");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                player1 = new Player(nameOfPlayer, gc[0]);
                break;
            case 2:
                player1 = new Player(nameOfPlayer, gc[1]);
                break;
            default:
                player1 = new Player(nameOfPlayer, gc[2]);
                break;
        }
        System.out.println(nameOfPlayer + " Welcome to the Adventure Game !");
        System.out.println("Your Character is a " + player1.gameCharacter.getCharacterTyp() + "\nDetails of your character:");
        System.out.println(player1.gameCharacter);
        return player1;
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

    public Location getActiveLocation() {
        return activeLocation;
    }

    public void setActiveLocation(Location activeLocation) {
        this.activeLocation = activeLocation;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Player{" + "damage=" + damage
                + ", health=" + health
                + ", money=" + money
                + ", charName='" + charName
                + '\'' + ", name='"+ name
                + '\''
                + ", activeLocation=" + this.getActiveLocation().getName().toString().substring(this.getActiveLocation().getName().toString().lastIndexOf('.')+1) + ", gameCharacter=" + gameCharacter + '}';
    }

}
