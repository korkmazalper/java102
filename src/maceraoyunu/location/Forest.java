package maceraoyunu.location;

import maceraoyunu.Player;
import maceraoyunu.monster.Monster;
import maceraoyunu.monster.Vampire;

public class Forest  extends BattleLocation{

    public Forest(Player p1) {
        super(p1, "Forest", new Vampire(), "water",3);
    }
}
