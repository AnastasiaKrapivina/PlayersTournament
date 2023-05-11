package ru.netology.project;

import java.util.ArrayList;

public class Game {
    ArrayList<Player> players = new ArrayList<>();

    public void register(Player player) {
        players.add(player);
    }

    public Player findByName(String playerName) {
        Player player1 = null;
        for (Player player : players) {
            if (player.getName().equals(playerName)) {
                player1 = player;
                return player1;
            }
        }
        return null;
    }

    public int round (String playerName1, String playerName2) {
        if (findByName(playerName1) == null) {
            throw new NotFoundException(playerName1);
        }
        if (findByName(playerName2) == null) {
            throw new NotFoundException(playerName2);
        }
        if (findByName(playerName1).getStrength() > findByName(playerName2).getStrength()){
            return 1;
        }
        if (findByName(playerName1).getStrength() < findByName(playerName2).getStrength()){
            return 2;
        }
     return 0;
    }

}
