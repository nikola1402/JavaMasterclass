package com.company;

/**
 * Created by nikol on 19-Jan-18.
 */
public class FootballTeam extends Team {

    public FootballTeam(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getPlayed() {
        return super.getPlayed();
    }

    @Override
    public int getWon() {
        return super.getWon();
    }

    @Override
    public int getDraw() {
        return super.getDraw();
    }

    @Override
    public int getLost() {
        return super.getLost();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setPlayed(int played) {
        super.setPlayed(played);
    }

    @Override
    public void setWon(int won) {
        super.setWon(won);
    }

    @Override
    public void setDraw(int draw) {
        super.setDraw(draw);
    }

    @Override
    public void setLost(int lost) {
        super.setLost(lost);
    }

    @Override
    public int ranking() {
        return super.ranking();
    }

    @Override
    public int compareTo(Team team) {
        return super.compareTo(team);
    }
}
