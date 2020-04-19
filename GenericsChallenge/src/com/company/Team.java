package com.company;

/**
 * Created by nikol on 19-Jan-18.
 */
public abstract class Team implements Comparable<Team>{
    protected String name;

    protected int played;
    protected int won;
    protected int draw;
    protected int lost;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getDraw() {
        return draw;
    }

    public int getLost() {
        return lost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int ranking(){
        return (won * 3) + draw;
    }

    @Override
    public int compareTo(Team team) {
        if(this.ranking() > team.ranking()){
            return -1;
        } else if(this.ranking() < team.ranking()){
            return 1;
        } else {
            return 0;
        }
    }
}
