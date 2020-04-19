package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikol on 21-Dec-17.
 */
public class Monster implements IObject {

    private String name;
    private int health;
    private String type;

    public Monster(String name, int health, String type) {
        this.name = name;
        this.health = health;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public List<String> write() {
        return null;
    }

    @Override
    public void read(List<String> valuesList) {

    }

    @Override
    public String toString(){
        return this.name +" "+this.health;
    }

    public void clawAttack(Player player){
        player.setHealth(player.getHealth());

    }


}
