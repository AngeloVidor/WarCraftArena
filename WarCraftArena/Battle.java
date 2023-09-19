package WarCraftArena;

import java.util.Scanner;

public class Battle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Attributes
        String player1Nickname;
        String player2Nickname;

        // Create player objects
        Battle battle = new Battle();

        // Player 1
        while (true) {
            System.out.println("Enter your nickname, Player1:");
            player1Nickname = scanner.nextLine();

            if (player1Nickname.equalsIgnoreCase("Sillenius")) {
                System.out.println("Hello, " + player1Nickname + " ");
                break;
            } else {
                System.out.println("Unknown nickname! Please try again.");
            }
        }

        // Player 2
        while (true) {
            System.out.println("Enter your nickname, Player2:");
            player2Nickname = scanner.nextLine();

            if (player2Nickname.equalsIgnoreCase("Wistful")) {
                System.out.println("Hello, " + player2Nickname + " ");
                break;
            } else {
                System.out.println("Unknown nickname! Please try again.");
            }
        }

        // After both players have provided their names
        System.out.println("You are ready! " + player1Nickname + " vs " + player2Nickname + " ");
        player1Nickname = scanner.nextLine();

        scanner.close();
    }
}
