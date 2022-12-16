package maceraoyunu.inventory;

public class Weapon {
    private String name;
    private int id;
    private int damage;
    private int money;

    public Weapon(String name, int id, int damage, int money) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.money = money;
    }
    public static Weapon[] weapons(){
        return new Weapon[]{new Weapon("Pistol", 1, 2, 5),
                new Weapon("Sword", 2, 3, 5),
                new Weapon("Rifle", 3, 7, 5)};
    }

    public static Weapon getWeaponById(int id) {
        for (Weapon w: Weapon.weapons()) {
            if(w.getId()==id){
                return w;
            }
        }
        return null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
