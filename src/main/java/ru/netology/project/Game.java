package ru.netology.project;

import java.util.HashMap;

public class Game {
    HashMap<String, Player> players = new HashMap<>();

    public void register(Player player) {
        players.put(player.getName(), player);
    }

    public Player findByName(String playerName) {
     Player player = players.get(playerName);
     return player;
    }

    public int round(String playerName1, String playerName2) {
        if (findByName(playerName1) == null) {
            throw new NotFoundException(playerName1);
        }
        if (findByName(playerName2) == null) {
            throw new NotFoundException(playerName2);
        }
        if (findByName(playerName1).getStrength() > findByName(playerName2).getStrength()) {
            return 1;
        }
        if (findByName(playerName1).getStrength() < findByName(playerName2).getStrength()) {
            return 2;
        }
        return 0;
    }

}
