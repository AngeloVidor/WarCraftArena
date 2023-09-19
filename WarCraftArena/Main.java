package WarCraftArena;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Players
        Player player1 = new Player("Sillenius (Warlock)", 100);
        Player player2 = new Player("Wistful (Warrior)", 100);

        // Warlock Skills
        String[] warlockSkills = {
            "1. Shadow Bolt (Ranged Shadow Attack)",
            "2. Immolate (Continuous Burn)",
            "3. Fear (Intimidate)",
            "4. Shadow Ward (Shadow Shield)"
        };

        // Warrior Skills
        String[] warriorSkills = {
            "1. Heroic Strike (Melee Attack)",
            "2. Rend (Bleed)",
            "3. Charge (Rush)",
            "4. Defensive Stance (Defensive Posture)"
        };

        // Game Loop
        boolean silleniusTurn = true;

        while (true) {
            Player currentPlayer = silleniusTurn ? player1 : player2;
            Player opponentPlayer = silleniusTurn ? player2 : player1;
            String[] currentSkills = silleniusTurn ? warlockSkills : warriorSkills;

            // Print current player's life
            System.out.println(currentPlayer.getName() + ": " + currentPlayer.getLife() + " HP");
            System.out.println(opponentPlayer.getName() + ": " + opponentPlayer.getLife() + " HP");

            // Print available skills
            System.out.println("Available skills for " + currentPlayer.getName() + ":");
            for (String skill : currentSkills) {
                System.out.println(skill);
            }

            // Ask for the current player's action
            System.out.print(currentPlayer.getName() + ", choose your action (1-" + currentSkills.length + "): ");
            int skillIndex = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            // Validate player's input
            if (skillIndex < 1 || skillIndex > currentSkills.length) {
                System.out.println("Invalid action. Try again.");
                continue;
            }

            String selectedSkill = currentSkills[skillIndex - 1].substring(3);

            // Action description
            String actionDescription = currentPlayer.getName() + " used skill '" + selectedSkill + "'";

            // Calculate damage based on the selected skill
            int damage = 0;

            if (selectedSkill.equals("Shadow Bolt (Ranged Shadow Attack)")) {
                damage = 20;
            } else if (selectedSkill.equals("Immolate (Continuous Burn)")) {
                damage = 15;
                actionDescription += " and inflicted burns.";
            } else if (selectedSkill.equals("Fear (Intimidate)")) {
                damage = 10;
                actionDescription += " and intimidated " + opponentPlayer.getName();
            } else if (selectedSkill.equals("Shadow Ward (Shadow Shield)")) {
                currentPlayer.increaseLife(15);
                actionDescription += " and cast a shadow shield.";
            } else if (selectedSkill.equals("Heroic Strike (Melee Attack)")) {
                damage = 18;
            } else if (selectedSkill.equals("Rend (Bleed)")) {
                damage = 12;
                actionDescription += " and caused bleeding.";
            } else if (selectedSkill.equals("Charge (Rush)")) {
                damage = 10;
                actionDescription += " and rushed with fury.";
            } else if (selectedSkill.equals("Defensive Stance (Defensive Posture)")) {
                currentPlayer.increaseLife(10);
                actionDescription += " and assumed a defensive posture.";
            }

            // Update player's life
            opponentPlayer.reduceLife(damage);

            // Print the action performed
            System.out.println(actionDescription);

            // Check if any player has won
            if (opponentPlayer.getLife() <= 0) {
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            // Switch to the next player's turn
            silleniusTurn = !silleniusTurn;
        }

        scanner.close();
    }
}

class Player {
    private String name;
    private int life;

    public Player(String name, int life) {
        this.name = name;
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public void reduceLife(int damage) {
        life -= damage;
    }

    public void increaseLife(int amount) {
        life += amount;
    }
}
