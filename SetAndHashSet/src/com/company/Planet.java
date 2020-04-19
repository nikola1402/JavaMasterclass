package com.company;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nikol on 03-Feb-18.
 */
public class Planet extends HeavenlyBody{

    private final double orbitalPeriod;
    private Set<Moon> satellites;


    public Planet(String name, double orbitalPeriod) {
        super(name);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    @Override
    public String getBodyType() {
        return super.getBodyType();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    @Override
    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public boolean addSattelite(Moon moon) {
        this.satellites.add(moon);
        return true;
    }

}
