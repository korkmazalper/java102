package maceraoyunu.inventory;

public class Inventory {
    Weapon weapon;

    public Inventory() {
        this.weapon = new Weapon("Fist",0,0,0);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
