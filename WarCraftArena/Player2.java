package WarCraftArena;

import java.util.Scanner;

public class Player2 {
    private String player2Nickname;
    private int player2Level;
    private float player2Dps;
    private float player2Health;
    private int hitDamagePlayer2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player2 player2 = new Player2();

        player2.player2Nickname = "Wistful";
        player2.player2Level = 300;
        player2.player2Dps = 250f;
        player2.player2Health = 500f;
        player2.hitDamagePlayer2 = 20;
    }
}
