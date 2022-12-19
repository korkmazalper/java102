package maceraoyunu.characters;

public abstract class GameCharacter {
    String characterTyp;
    int id;
    int damage;
    int health;
    int money;
int armor;
    public String getCharacterTyp() {
        return characterTyp;
    }

    public void setCharacterTyp(String characterTyp) {
        this.characterTyp = characterTyp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GameCharacter(int damage, int health, int money) {
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

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "characterTyp='" + characterTyp + '\'' +
                ", damage=" + damage +
                ", health=" + health +
                ", money=" + money
                +", armor=" + armor+
                '}';
    }
}
