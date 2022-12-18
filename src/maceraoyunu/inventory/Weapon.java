package maceraoyunu.inventory;

public class Weapon extends Item{
    public Weapon(){
    }

    public Weapon( int id, String name,int price, int damage) {
        super(id, name, price);
        this.setDamage(damage);
    }

    public static Weapon[] weapons(){
        return new Weapon[]{new Weapon( 1, "Pistol",2, 5),
                new Weapon( 2, "Sword",3, 5),
                new Weapon( 3, "Rifle",7, 5)};
    }

    public static Weapon getWeaponById(int id) {
        for (Weapon w: Weapon.weapons()) {
            if(w.getId()==id){
                return w;
            }
        }
        return null;
    }



}
