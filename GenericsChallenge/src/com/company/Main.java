package com.company;

public class Main {

    public static void main(String[] args) {
        BasketballTeam cavs = new BasketballTeam("Cleveland Cavaliers");
        BasketballTeam lakers = new BasketballTeam("LA Lakers");
        BasketballTeam rockets = new BasketballTeam("Houston Rockets");

        FootballTeam manutd = new FootballTeam("Manchester United");
        FootballTeam arsenal = new FootballTeam("Arsenal");
        FootballTeam liverpool = new FootballTeam("Liverpool");

        League<BasketballTeam> nba = new League<>("NBA");
        League<FootballTeam> premierLeague = new League<>("Premier League");

        nba.addTeam(cavs);
        nba.addTeam(lakers);
        nba.addTeam(rockets);
        System.out.println("*********************");
        premierLeague.addTeam(manutd);
        premierLeague.addTeam(arsenal);
        premierLeague.addTeam(liverpool);
        System.out.println("*********************");
        nba.listTeams();
        System.out.println("*********************");
        premierLeague.listTeams();
        System.out.println("*********************");
        nba.matchResult(cavs, lakers, 99, 100);
        nba.matchResult(cavs, rockets, 55, 90);
        nba.matchResult(lakers, rockets, 95, 90);
        nba.matchResult(lakers, cavs, 90, 96);
        nba.matchResult(rockets, cavs, 80, 80);
        nba.matchResult(rockets, lakers, 95, 96);
        System.out.println("*********************");
        premierLeague.matchResult(manutd, arsenal, 3, 1);
        premierLeague.matchResult(manutd, liverpool, 2,1);
        premierLeague.matchResult(arsenal, manutd, 1,1);
        premierLeague.matchResult(arsenal, liverpool, 2, 0);
        premierLeague.matchResult(liverpool, manutd, 0, 1);
        premierLeague.matchResult(liverpool, arsenal, 2, 0);
        System.out.println("*********************");
        nba.getPoints(cavs);
        System.out.println("*********************");
        nba.getPoints(lakers);
        System.out.println("*********************");
        nba.getPoints(rockets);
        System.out.println("*********************");
        premierLeague.getPoints(manutd);
        System.out.println("*********************");
        premierLeague.getPoints(arsenal);
        System.out.println("*********************");
        premierLeague.getPoints(liverpool);
        System.out.println("*********************");
        nba.showLeagueTable();
        System.out.println("*********************");
        premierLeague.showLeagueTable();
    }
}
