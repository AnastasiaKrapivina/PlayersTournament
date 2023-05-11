package ru.netology.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class GameTest {

    Player player1 = new Player(1, "Игрок1", 1);
    Player player2 = new Player(2, "Игрок2", 2);
    Player player3 = new Player(3, "Игрок3", 3);
    Player player4 = new Player(4, "Игрок4", 1);

    @Test
    public void testDataOutput() {
        Player rep = new Player(1, "Игрок1", 1);
        rep.setId(8);
        rep.setName("Игрок8");
        rep.setStrength(3);


        Assertions.assertEquals(8, rep.getId());
        Assertions.assertEquals("Игрок8", rep.getName());
        Assertions.assertEquals(3, rep.getStrength());

    }

    @Test
    public void testBothRegisteredOne() {
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);

        int expected = 1;
        int actual = game.round("Игрок2", "Игрок1");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBothRegisteredTwo() {
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);

        int expected = 2;
        int actual = game.round("Игрок1", "Игрок2");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBothRegisteredBoth() {
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);

        int expected = 0;
        int actual = game.round("Игрок1", "Игрок4");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOneRegisteredOne() {
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);

        Assertions.assertThrows(NotFoundException.class, () -> {
            game.round("Игрок1", "Игрок8");
        });
    }

    @Test
    public void testOneRegisteredTwo() {
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);

        Assertions.assertThrows(NotFoundException.class, () -> {
            game.round("Игрок8", "Игрок1");
        });
    }

    @Test
    public void testNullRegistered() {
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);

        Assertions.assertThrows(NotFoundException.class, () -> {
            game.round("Игрок8", "Игрок9");
        });
    }

}