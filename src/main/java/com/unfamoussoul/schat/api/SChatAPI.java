package com.unfamoussoul.schat.api;

import com.unfamoussoul.schat.api.exception.NotUniquePseudoPlayerNameException;
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


    /**
     * Добавить Псевдо-игрока в список игроков.
     * Он будет добавлен как опция для отправки личных сообщений.
     * @param pseudoPlayer псевдо-игроки, которые регистрируется как игроки
     * @throws NotUniquePseudoPlayerNameException если псевдо-игрок под таким ником уже зарегистрирован
     */
    public native void registerPseudoPlayer(@NotNull PseudoPlayer... pseudoPlayer) throws NotUniquePseudoPlayerNameException;

    /**
     * Убрать Псевдо-игрока в список игроков.
     * @param pseudoPlayer псевдо-игроки, которые были зарегистрированы как игроки
     */
    public native void unregisterPseudoPlayer(@NotNull PseudoPlayer... pseudoPlayer);
}
