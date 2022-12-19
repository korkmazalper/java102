package maceraoyunu.inventory;

import maceraoyunu.gametools.Tools;

public class Inventory {
    Weapon weapon;
    Armor armor;
    Item item;

    public Inventory() {
        this.weapon = new Weapon(0,"Fist",0,0);
        this.armor=new Armor(0,"T-shirt",0,0);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        if(Tools.bringClassName(item).equals("Weapon")){
            this.weapon = (Weapon) item;
        } else if (Tools.bringClassName(item).equals("Armor")) {
            this.armor = (Armor) item;
        }

    }
}
