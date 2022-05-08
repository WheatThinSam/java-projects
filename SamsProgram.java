//Ruben Gonzalez
//Michael Madrigal
//Practice
//9/30/17

import java.util.Scanner;
import java.util.Random;


public class SamsProgram {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		String[] enemies = { "skeleton" , "zombie" , "worrior" , "assasin" };
		
		int maxEnemyHealth = 75;
		int enemyAttackDamage = 25;
		
		int health = 100;
		int attackDamage = 30;
		int numHealthPotions = 3;
		int healthPotionAmount = 25;
		int healthPotionDropChance = 45;
		
		boolean running = true;
		
		System.out.println("Welcome to the dungeon Hero!");
		
		GAME:
		while(running) {
			System.out.println("------------------------------------------------");
			
			int enemyHealth = rand.nextInt(maxEnemyHealth);
			String enemy = enemies[rand.nextInt(enemies.length)];
			System.out.println("\t# " + enemy + " has appeared! #\n");
			
			while(enemyHealth > 0) {
				System.out.println("\tYour HP: " + health);
				System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
				System.out.println("\n\tWhat would you like to do?");
				System.out.println("\t1. Attack");
				System.out.println("\t2. Drink Health Potion");
				System.out.println("\t3. Run!");
				
				String input = scan.nextLine();
				if(input.equals("1")) {
					int damageDealt = rand.nextInt(attackDamage);
					int damageTaken = rand.nextInt(enemyAttackDamage);
					
					enemyHealth -= damageDealt;
					health -= damageTaken;
					
					System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
					System.out.println("\t> you recieve " + damageTaken + " in retaliation!");
					
					if(health < 1) {
						System.out.println("\t> You have taken too much damage, you are too weak to go on!");
						break;
					}
					
				}
				else if(input.equals("2")) {
					if(numHealthPotions > 0) {
						health += healthPotionAmount;
						numHealthPotions--;
						System.out.println("\t> You drink a health potion, healing yourself by " + healthPotionAmount + "."
										+ "\n\t> you now have " + health + " HP."
										+ "\n\t> You have " + numHealthPotions + " health potion(s) left.\n");
					}
					else {
						System.out.println("\t> You have no health potions left! Defeat enemies for a chance to get one!");
					}
				}
				else if(input.equals("3")){
					System.out.println ("\tYou run away from the " + enemy + "!");
					continue GAME;
				}
				else {
					System.out.println("\tInvalid command!");
				 }
			}
			
			if (health < 1) {
			System.out.println("you limp out of the dungeon weak from battle.");
			break;
			}
		
			System.out.println("------------------------------------------------");
			System.out.println(" # " + enemy + " was defeated! # ");
			System.out.println(" # You have " + health + " HP left. #");
			if (rand.nextInt(100) < healthPotionDropChance) {
				numHealthPotions++;
				System.out.println(" # The " + enemy + " dropped a health potion! # ");
				System.out.println(" # You now have " + numHealthPotions + " health potion(s). # ");
			}
			System.out.println("------------------------------------------------");
			System.out.println("What would you like to do now?");
			System.out.println("1. Continue Fighting");
			System.out.println("2. Exit Dungeon");
			
			String input = scan.nextLine();
			
			while(!input.equals("1") && !input.equals("2")) {
				System.out.println("Invalid command!");
				input = scan.nextLine();
			}
			
			if(input.equals("1")) {
				System.out.println("You continue on your adventure!");
			}
			else if(input.equals("2")) {
				System.out.println("You exit the dungeon, successful from your adventures!");
				break;
			}
			
			
		}
		
		System.out.println("#####################");
		System.out.println("# THANKS FOR PLAYING#");
		System.out.println("#####################");
	
	}
}