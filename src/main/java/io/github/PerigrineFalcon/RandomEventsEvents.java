package io.github.PerigrineFalcon;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.TNTPrimed;

public class RandomEventsEvents {
    public void meteorShower(Location location, long power) {
        location.setY(256);
        TNTPrimed meteor = (TNTPrimed) location.getWorld().spawnEntity(location, EntityType.PRIMED_TNT);
        meteor.setFuseTicks(900);
        meteor.setYield(power);
    }
}
