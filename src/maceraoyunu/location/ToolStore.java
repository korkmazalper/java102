package maceraoyunu.location;

import maceraoyunu.Player;
import maceraoyunu.gametools.Tools;
import maceraoyunu.inventory.Armor;
import maceraoyunu.inventory.Item;
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
        System.out.print("Your choice? -->");
        int selection = Location.sc.nextInt();
        while(selection<1 || selection>3){
            System.out.println("Invalid choice, choose again: ");
            selection = sc.nextInt();
            onLocation();
        }
        switch(selection){
            case 1:
                printItems(Item.items("Weapon"));
                buyItem(new Weapon());
                break;
            case 2:
                printItems(Item.items("Armor"));
                buyItem(new Armor());
                break;
            default:
                System.out.println("Quitting from Store !");

        }
        return true;
    }
    private void buyItem(Item item) {
        System.out.println("Choice:");
        int selectItem=sc.nextInt();
        while(selectItem<1 || selectItem>Item.items(Tools.bringClassName(item)).length){
            printItems(Item.items(Tools.bringClassName(Item.items(Tools.bringClassName(item))[0])));
            System.out.println(" Invalid choice, reselect: ");
            selectItem=sc.nextInt();
        }
        Item itemToBuy=Item.getItemById(selectItem,Item.items(Tools.bringClassName(item))[0]);
        if(itemToBuy!=null){
            if(this.getP1().getMoney()<itemToBuy.getPrice()){
                System.out.println("You do not have enough money to buy this item !");
            }else{
                this.getP1().setMoney(this.getP1().getMoney()-itemToBuy.getPrice());
                System.out.println("Your previous weapon:"+this.getP1().getInventory().getWeapon().getName());
                this.getP1().getInventory().setItem(itemToBuy);
                System.out.println(itemToBuy.getName() + " was bought !");
                printActualInfo();

            }
        }

    }
    public void printActualInfo(){
        System.out.println("Your money is now: " + this.getP1().getMoney());
        System.out.println("Your damage is now: " + this.getP1().getDamage());
        System.out.println("Your armor is now: " + this.getP1().getArmor());
        System.out.println(this.getP1());
    }
    private void printItems(Item[] item){
        if(!item.equals(null)){
            System.out.println("### " + Tools.bringClassName(item[0])+" ###");
            for (Item i: item) {
                System.out.println(i.getId() + "-"+i.getName() + " Price:" + i.getPrice() + " Damage:"+ i.getDamage()+ " Armor:" +i.getBlock());
            }
        }

    }

}
