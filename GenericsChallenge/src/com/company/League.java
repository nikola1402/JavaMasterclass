package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by nikol on 19-Jan-18.
 */
public class League<T extends Team> {

    private ArrayList<T> teams = new ArrayList<>();
    private String leagueName;

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public boolean addTeam (T team){
        if(!teamExists(team)){
            this.teams.add(team);
            System.out.println(team.getName() + " added to the " +this.leagueName);
            return true;
        } else {
            System.out.println("Team not added.");
            return false;
        }
    }

    public boolean teamExists(T team){
        for(int i=0; i<this.teams.size(); i++){
            if (team.getName() == this.teams.get(i).getName()) {
                System.out.println("Team already exists in this league.");
                return true;
            }
        }
        return false;
    }

    public void matchResult(T homeTeam, T awayTeam, int home, int away){
        homeTeam.setPlayed(homeTeam.getPlayed() + 1);
        awayTeam.setPlayed(awayTeam.getPlayed() + 1);

        if(home > away){
            homeTeam.setWon(homeTeam.getWon() + 1);
            awayTeam.setLost(awayTeam.getLost() + 1);
            System.out.println(homeTeam.getName() + " won against " + awayTeam.getName());
        } else if (home < away){
            homeTeam.setLost(homeTeam.getLost() + 1);
            awayTeam.setWon(awayTeam.getWon() + 1);
            System.out.println(homeTeam.getName() + " lost against " + awayTeam.getName());
        } else {
            homeTeam.setDraw(homeTeam.getDraw() + 1);
            awayTeam.setDraw(awayTeam.getDraw() + 1);
            System.out.println(homeTeam.getName() + " drew against " + awayTeam.getName());
        }
    }

    public void showLeagueTable(){
        Collections.sort(teams);
        for(T t : teams){
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }

    public void getPoints(T team){
        int won = team.getWon();
        int lost = team.getLost();
        int draw = team.getDraw();
        int played = team.getPlayed();
        int points = won*3 + draw;

        System.out.println(team.getName() + " have played " + played + " matches.");
        System.out.println("They've won " + won + " times, drew " + draw + " times and lost " + lost);
        System.out.println("They have " + points + " points.");

    }

    public void listTeams(){
        for(int i=0; i<this.teams.size(); i++){
            Team team = this.teams.get(i);
            System.out.println("Team " + (i+1) + ": " + team.getName());
        }
    }



}
