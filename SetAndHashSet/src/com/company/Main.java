package com.company;

import java.util.*;

public class Main {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<Star> stars = new HashSet<>();
    private static Set<Planet> planets = new HashSet<>();
    private static Set<Moon> moons = new HashSet<>();

    public static void main(String[] args) {

        Star star = new Star("Sun");
        solarSystem.put(star.getName(), star);
        stars.add(star);

        Planet planet = new Planet("Mercury", 255);
        solarSystem.put(planet.getName(), planet);
        planets.add(planet);
        star.addSattelite(planet);

        planet = new Planet("Venus", 255);
        solarSystem.put(planet.getName(), planet);
        planets.add(planet);
        star.addSattelite(planet);

        planet = new Planet("Earth", 365);
        solarSystem.put(planet.getName(), planet);
        planets.add(planet);
        star.addSattelite(planet);

        Moon moon = new Moon("Moon", 27);
        solarSystem.put(moon.getName(), moon);
        planet.addSattelite(moon);
        moons.add(moon);

        planet = new Planet("Mars", 687);
        solarSystem.put(planet.getName(), planet);
        planets.add(planet);
        star.addSattelite(planet);

        moon = new Moon("Deimos", 1.3);
        solarSystem.put(moon.getName(), moon);
        planet.addSattelite(moon);
        moons.add(moon);

        moon = new Moon("Phobos", 0.3);
        solarSystem.put(moon.getName(), moon);
        planet.addSattelite(moon);
        moons.add(moon);

        planet = new Planet("Jupiter", 4332);
        solarSystem.put(planet.getName(), planet);
        planets.add(planet);
        star.addSattelite(planet);

        moon = new Moon("Io", 1.8);
        solarSystem.put(moon.getName(), moon);
        planet.addSattelite(moon);
        moons.add(moon);

        moon = new Moon("Europa", 3.5);
        solarSystem.put(moon.getName(), moon);
        planet.addSattelite(moon);
        moons.add(moon);

        moon = new Moon("Ganymede", 7.1);
        solarSystem.put(moon.getName(), moon);
        planet.addSattelite(moon);
        moons.add(moon);

        moon = new Moon("Callisto", 16.7);
        solarSystem.put(moon.getName(), moon);
        planet.addSattelite(moon);
        moons.add(moon);

        planet = new Planet("Saturn", 10759);
        solarSystem.put(planet.getName(), planet);
        planets.add(planet);
        star.addSattelite(planet);

        planet = new Planet("Uranus", 30660);
        solarSystem.put(planet.getName(), planet);
        planets.add(planet);
        star.addSattelite(planet);

        planet = new Planet("Neptune", 165);
        solarSystem.put(planet.getName(), planet);
        planets.add(planet);
        star.addSattelite(planet);

        planet = new Planet("Pluto", 248);
        solarSystem.put(planet.getName(), planet);
        planets.add(planet);
        star.addSattelite(planet);


        System.out.println("****************************");
        System.out.println("*******  TEST 1  ***********");
        System.out.println("****************************");

        System.out.println("Solar system:");
        Collection<HeavenlyBody> col1 = solarSystem.values();
        for(HeavenlyBody h : col1){
            System.out.println("\t " +h.getName());
        }


        HeavenlyBody body = solarSystem.get("Mars");
        System.out.println("Moons of " + body.getName());
        for(HeavenlyBody planetMoon : body.getSatellites()){
            System.out.println("\t" + planetMoon.getName());
        }

        System.out.println("All Moons");
        for(HeavenlyBody m : moons){
            System.out.println("\t" + m.getName());
        }

        System.out.println("****************************");
        System.out.println("*******  STAR  ***********");
        System.out.println("****************************");
        Set<HeavenlyBody> starSat = star.getSatellites();
        for(HeavenlyBody h : starSat){
            System.out.println("\t" + h.getName());
        }


    }
}
