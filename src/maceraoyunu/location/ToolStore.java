package maceraoyunu.location;

import maceraoyunu.Player;
import maceraoyunu.inventory.Weapon;

public class ToolStore extends SafeLocation{
    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    @Override
    public boolean onLocation() {
        super.onLocation();
        System.out.println("You can buy items here !");
        System.out.println("1- Weapons");
        System.out.println("2- Armors");
        System.out.println("3- Quit");
        System.out.print("Your choise? -->");
        int selection = Location.sc.nextInt();
        while(selection<1 || selection>3){
            System.out.println("Invalid choice, choose again: ");
            selection = sc.nextInt();
        }
        switch(selection){
            case 1:
                printWeapons();
                buyWeapon();
                break;
            case 2:
                printArmors();
                break;
            case 3:
                System.out.println("Quitting from Store !");

        }
        return true;
    }

    private void buyWeapon() {
        System.out.println("Choice:");
        int selectWeapon=sc.nextInt();
        while(selectWeapon<1 || selectWeapon>Weapon.weapons().length){
            System.out.println(" Invalid choice, reselect: ");
            selectWeapon=sc.nextInt();
        }
        Weapon weaponToBuy=Weapon.getWeaponById(selectWeapon);
        if(weaponToBuy!=null){
            if(this.getP1().getMoney()<weaponToBuy.getMoney()){
                System.out.println("You do not have enough money to buy this weapon !");
            }else{
                this.getP1().setMoney(this.getP1().getMoney()-weaponToBuy.getMoney());
                System.out.println("Your previous weapon:"+this.getP1().getInventory().getWeapon().getName());
                this.getP1().getInventory().setWeapon(weaponToBuy);
                System.out.println(weaponToBuy.getName() + " was bought !");
                System.out.println("Your money is now: " + this.getP1().getMoney());
            }
        }

    }

    private void printWeapons() {
        System.out.println("############# Weapons ###############");
        for (Weapon weapon:Weapon.weapons()) {
            System.out.println(weapon.getId() + "-"+weapon.getName() + " Price:" + weapon.getMoney() + " Damage:"+ weapon.getDamage());
        }

    }
    private void printArmors() {
        System.out.println("Armors");
    }
}
