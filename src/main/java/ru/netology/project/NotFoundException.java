package ru.netology.project;

public class NotFoundException  extends RuntimeException {
    public NotFoundException(String playerName) {
        super("Игрок с именем " + playerName + " не найден");
    }
}
