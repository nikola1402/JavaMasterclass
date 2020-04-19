package com.company;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;

        player.loseHealth(damage);
        System.out.println("Remaining health = " +player.healthRemaining());

        damage = 11;
        player.health = 100;
        player.loseHealth(damage);
        System.out.println("Remaining health = " +player.healthRemaining());


        EnhancedPlayer player2 = new EnhancedPlayer("Mark", 50, "Sword");
        System.out.println("Initial health is "+player2.getHealth());
    }
}
