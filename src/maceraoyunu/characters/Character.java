package maceraoyunu.characters;

public abstract class Character {
    String characterTyp;
    int damage;
    int health;
    int money;

    public Character(int damage, int health, int money) {
        this.damage = damage;
        this.health = health;
        this.money = money;
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

    @Override
    public String toString() {
        return "Character{" +
                "characterTyp='" + characterTyp + '\'' +
                ", damage=" + damage +
                ", health=" + health +
                ", money=" + money +
                '}';
    }
}
