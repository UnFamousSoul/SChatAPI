package com.unfamoussoul.schat.api.event;

import com.unfamoussoul.schat.api.PseudoPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("unused")
public class PseudoPlayerPrivateMessageEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final Player sender;
    private final PseudoPlayer pseudoPlayer;
    private String message;

    public PseudoPlayerPrivateMessageEvent(@NotNull Player sender, @NotNull PseudoPlayer pseudoPlayer) {
        this.sender = sender;
        this.pseudoPlayer = pseudoPlayer;
        this.message = null;
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

    public void reply(@NotNull String message) {
        this.message = message;
    }

    public @Nullable String getMessage() {
        return message;
    }
}
