package maceraoyunu.characters;

public class Samurai extends GameCharacter {
    public Samurai(int damage, int health, int money) {
        super(damage, health, money);
        this.characterTyp= String.valueOf(this.getClass()).substring(String.valueOf(this.getClass()).lastIndexOf('.')+1);
    }
}
