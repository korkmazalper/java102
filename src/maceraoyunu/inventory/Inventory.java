package maceraoyunu.inventory;

import maceraoyunu.gametools.Tools;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    Weapon weapon;
    Armor armor;
    Item item;
    List<String> awards = new ArrayList<String>();
    List<Item> inventoryList= new ArrayList<Item>();
    public String addToAwards(String str){
        return this.awards.add(str)?"Award was added to Inventory":"Award was not added to Inventory!";
    }

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

    public List<String> getAwards() {
        return awards;
    }

    public void setAwards(List<String> awards) {
        this.awards = awards;
    }

    public List<Item> getInventoryList() {
        return inventoryList;
    }
    public void addToInventoryList(Item item){
        if(!this.inventoryList.contains(item)){
            this.inventoryList.add(item);
        }

    }
    public void setInventoryList(List<Item> inventoryList) {
        this.inventoryList = inventoryList;
    }

    public void setItem(Item item) {
        if(Tools.bringClassName(item).equals("Weapon")){
            this.weapon = (Weapon) item;
        } else if (Tools.bringClassName(item).equals("Armor")) {
            this.armor = (Armor) item;
        }

    }
}
