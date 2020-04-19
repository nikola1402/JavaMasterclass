package com.company;

/**
 * Created by nikol on 03-Dec-17.
 */
public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining
        }
    }

    public int healthRemaining(){
        return this.health;
    }


}
