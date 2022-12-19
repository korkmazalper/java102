package maceraoyunu.inventory;

public class Armor extends Item {
    public Armor(){
    }
    public Armor(int id, String name, int price, int block) {
        super(id, name, price);
        this.setBlock(block);
    }
    public static Armor[] armors(){
        return new Armor[]{new Armor(1, "Light", 2, 1),
                new Armor(2,"Middle" , 3, 3),
                new Armor(3, "Heavy", 7, 5)};
    }

}
