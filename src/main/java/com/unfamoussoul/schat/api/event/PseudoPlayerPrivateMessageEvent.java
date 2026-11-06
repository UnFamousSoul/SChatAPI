package com.unfamoussoul.schat.api.event;

import com.unfamoussoul.schat.api.PseudoPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Вызывается, если псевдо-игроку написали в личные сообщения.
 * <pre><code>
 * {@code @EventHandler}
 * public void onPseudoMessage(PseudoPlayerPrivateMessageEvent event) {
 *     event.reply("Привет, " + event.getSender().getName() + "!");
 * }
 * </code></pre>
 */
@SuppressWarnings("unused")
public class PseudoPlayerPrivateMessageEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final Player sender;
    private final PseudoPlayer pseudoPlayer;
    private String message;

    public PseudoPlayerPrivateMessageEvent(@NotNull Player sender, @NotNull PseudoPlayer pseudoPlayer) {
        super(true);
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

    /**
     * @return какому из псевдо-игроков отправили личное сообщение
     */
    public @NotNull PseudoPlayer getPseudoPlayer() {
        return pseudoPlayer;
    }

    /**
     * @return отправивший личные сообщения.
     */
    public @NotNull Player getSender() {
        return sender;
    }

    // TODO: сделать возможность отправлять несколько сообщений с задержкой между ними
    /**
     * При получении личного сообщения от игрока к псевдо-игроку с помощью этого метода можно
     * написать в ответ одно и только одно сообщение.
     * @param message сообщение псевдо-игрока.
     */
    public void reply(@NotNull String message) {
        this.message = message;
    }

    public @Nullable String getMessage() {
        return message;
    }
}
