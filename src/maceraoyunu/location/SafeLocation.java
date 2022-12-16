package maceraoyunu.location;

import maceraoyunu.Player;

public abstract class SafeLocation extends Location {
    public SafeLocation(Player p1, String name) {
        super(p1, name);
    }

    @Override
    public boolean onLocation() {
       super.onLocation();
       return true;
    }
}
