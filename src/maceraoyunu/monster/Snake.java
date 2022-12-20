package maceraoyunu.monster;

import maceraoyunu.gametools.Tools;

public class Snake extends Monster {
    public Snake() {
        super(4, "Snake", 10, 12, -1);
        this.setDamage((int)Tools.chanceRandomizer(3,6));
    }

}
