package com.unfamoussoul.schat.api;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public final class SChatAPI {

    /**
     * Отправить локальное сообщение в радиусе, настроенным в конфиге SChat,
     * @param pseudoPlayer псевдо-игрок, от его лица отправляется сообщение в чат
     * @param message сообщение
     */
    public native void sendLocalMessage (@NotNull PseudoPlayer pseudoPlayer, @NotNull String message);

    /**
     * Отправить глобальное сообщение через SChat
     * @param pseudoPlayer псевдо-игрок, от его лица отправляется сообщение в чат
     * @param message сообщение
     */
    public native void sendMessage (@NotNull PseudoPlayer pseudoPlayer, @NotNull String message);
}
