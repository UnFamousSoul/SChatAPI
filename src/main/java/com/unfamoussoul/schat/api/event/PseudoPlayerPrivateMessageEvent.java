package com.unfamoussoul.schat.api.event;

import com.unfamoussoul.schat.api.PseudoPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class PseudoPlayerPrivateMessageEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final Player sender;
    private final PseudoPlayer pseudoPlayer;

    public PseudoPlayerPrivateMessageEvent(@NotNull Player sender, @NotNull PseudoPlayer pseudoPlayer) {
        this.sender = sender;
        this.pseudoPlayer = pseudoPlayer;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public PseudoPlayer getPseudoPlayer() {
        return pseudoPlayer;
    }

    public Player getSender() {
        return sender;
    }
}
