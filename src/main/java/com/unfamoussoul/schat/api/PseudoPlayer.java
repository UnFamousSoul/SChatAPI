package com.unfamoussoul.schat.api;

import org.bukkit.Location;

/**
 * Псевдо-игрок для работы с SChatAPI. Если у игрока не будет имени, то API выдаст ошибку.
 */
@SuppressWarnings("unused")
public class PseudoPlayer {

    private String name;
    private Location location;
    private boolean allowMiniMessage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean isAllowMiniMessage() {
        return allowMiniMessage;
    }

    public void setAllowMiniMessage(boolean allowMiniMessage) {
        this.allowMiniMessage = allowMiniMessage;
    }
}
