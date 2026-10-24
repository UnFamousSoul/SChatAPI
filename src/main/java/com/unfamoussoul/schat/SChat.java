package com.unfamoussoul.schat;

import com.unfamoussoul.schat.api.SChatAPI;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Главный класс плагина.
 */
public class SChat extends JavaPlugin {

    /**
     * Метод получения SChatAPI - главного интерфейса взаимодействия с плагином SChat
     */
    public static native SChatAPI getAPI();
}
