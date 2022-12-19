package maceraoyunu.location;

import maceraoyunu.Player;
import maceraoyunu.monster.Bear;

public class River extends BattleLocation{
    public River(Player p1) {
        super(p1, "River", new Bear(),"fish",3);
    }
}
