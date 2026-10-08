package Subscriber;

	import java.util.Random;
	import java.util.Scanner;

	class Player {

	    String playerName;
	    int health;
	    int attackPower;

	    Random random = new Random();

	    // Constructor
	    Player(String playerName) {
	        this.playerName = playerName;
	        this.health = 100;
	        this.attackPower = 10;
	    }

	    // Roll dice
	    int rollDice() {
	        return random.nextInt(6) + 1;
	    }

	    // Calculate damage based on dice value
	    int calculateDamage(int dice) {

	        if (dice == 1) {
	            return 0;           // Miss
	        } 
	        else if (dice >= 2 && dice <= 3) {
	            return 10;          // Normal Attack
	        } 
	        else if (dice >= 4 && dice <= 5) {
	            return 20;          // Critical Attack
	        } 
	        else {
	            return 30;          // Super Attack
	        }
	    }

	    // Take damage
	    void takeDamage(int damage) {
	        health = health - damage;

	        if (health < 0) {
	            health = 0;
	        }
	    }

	    // Display player status
	    void displayStatus() {
	        System.out.println(playerName + " Health : " + health);
	    }

	    // Get attack type
	    String getAttackType(int dice) {

	        if (dice == 1) {
	            return "MISS";
	        } 
	        else if (dice >= 2 && dice <= 3) {
	            return "NORMAL ATTACK";
	        } 
	        else if (dice >= 4 && dice <= 5) {
	            return "CRITICAL ATTACK";
	        } 
	        else {
	            return "SUPER ATTACK";
	        }
	    }
	}

	public class Dice {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("======================================");
	        System.out.println("        DICE ");
	        System.out.println("======================================");

	        // Get player names
	        System.out.print("Enter Player 1 Name: ");
	        String name1 = sc.nextLine();

	        System.out.print("Enter Player 2 Name: ");
	        String name2 = sc.nextLine();

	        // Array of objects
	        Player[] players = new Player[2];

	        players[0] = new Player(name1);
	        players[1] = new Player(name2);

	        int round = 1;

	        // Maximum 10 rounds
	        while (round <= 10 &&
	               players[0].health > 0 &&
	               players[1].health > 0) {

	            System.out.println("\n======================================");
	            System.out.println("             ROUND " + round);
	            System.out.println("======================================");

	            players[0].displayStatus();
	            players[1].displayStatus();

	            // Both players roll dice
	            int dice1 = players[0].rollDice();
	            int dice2 = players[1].rollDice();

	            System.out.println("\n" + players[0].playerName + " rolls: " + dice1);
	            System.out.println(players[1].playerName + " rolls: " + dice2);

	            // Check for draw
	            if (dice1 == dice2) {

	                System.out.println("\nDRAW ROUND!");
	                System.out.println("Both players rolled " + dice1);
	                System.out.println("No attack this round.");

	            }

	            // Player 1 attacks
	            else if (dice1 > dice2) {

	                int damage = players[0].calculateDamage(dice1);
	                String attackType = players[0].getAttackType(dice1);

	                System.out.println("\n" + players[0].playerName + " wins the dice roll!");
	                System.out.println("Attack Type : " + attackType);
	                System.out.println("Damage      : " + damage);

	                players[1].takeDamage(damage);

	                System.out.println(players[1].playerName +
	                                   " Health : " + players[1].health);
	            }

	            // Player 2 attacks
	            else {

	                int damage = players[1].calculateDamage(dice2);
	                String attackType = players[1].getAttackType(dice2);

	                System.out.println("\n" + players[1].playerName + " wins the dice roll!");
	                System.out.println("Attack Type : " + attackType);
	                System.out.println("Damage      : " + damage);

	                players[0].takeDamage(damage);

	                System.out.println(players[0].playerName +
	                                   " Health : " + players[0].health);
	            }

	            round++;
	        }

	        // Battle over
	        System.out.println("\n======================================");
	        System.out.println("            BATTLE OVER");
	        System.out.println("======================================");

	        players[0].displayStatus();
	        players[1].displayStatus();

	        // Find winner
	        if (players[0].health > players[1].health) {

	            System.out.println("\nWinner : " + players[0].playerName);

	        } 
	        else if (players[1].health > players[0].health) {

	            System.out.println("\nWinner : " + players[1].playerName);

	        } 
	        else {

	            System.out.println("\nResult : DRAW");
	        }

	        System.out.println("Total Rounds : " + (round - 1));

	        sc.close();
	    }
	}

