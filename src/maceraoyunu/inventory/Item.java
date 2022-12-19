package maceraoyunu.inventory;

import maceraoyunu.gametools.Tools;

public class Item {
    private int id;
    private String name;
    private int price;
    private int block;
    private int damage;
public Item(){}
    public Item(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }

    public static Item[] items(String item){
        return item.equals("Armor")?new Armor[]{new Armor(1, "Light", 2, 1),
                new Armor(2,"Middle" , 3, 3),
                new Armor(3, "Heavy", 7, 5)}:
                new Weapon[]{new Weapon( 1, "Pistol",2, 5),
                        new Weapon( 2, "Sword",3, 5),
                        new Weapon( 3, "Rifle",7, 5)};
    }

    public static Item getItemById(int id, Item it) {
        for (Item item: Item.items(Tools.bringClassName(it))) {
            if(item.getId()==id) {
                return item;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
