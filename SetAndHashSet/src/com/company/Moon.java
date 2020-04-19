package com.company;

import java.util.Set;

/**
 * Created by nikol on 03-Feb-18.
 */
public class Moon extends HeavenlyBody {

    private final double orbitalPeriod;

    public Moon(String name, double orbitalPeriod) {
        super(name);
        this.orbitalPeriod = orbitalPeriod;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    @Override
    public String getBodyType() {
        return super.getBodyType();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
