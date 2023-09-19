package WarCraftArena;

import java.util.Scanner;

public class Player1 {
    private String player1Nickname;
    private int player1Level;
    private float player1Dps;
    private float player1Health;
    private int hitDamagePlayer1;
    private double castPlayer1;
    private double castSkill1;
    private double castFire;

    public double getCastFire() {
        return castFire;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player1 player1 = new Player1();

        player1.setPlayer1Nickname("Sillenius");
        player1.player1Level = 60;
        player1.player1Dps = 500;
        player1.player1Health = 1000f;
        player1.hitDamagePlayer1 = 100;
        player1.castPlayer1 = 150d;
        player1.castSkill1 = 100;
    }

    public String getPlayer1Nickname() {
        return player1Nickname;
    }

    public void setPlayer1Nickname(String player1Nickname) {
        this.player1Nickname = player1Nickname;
    }
}
