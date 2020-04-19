package com.company;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nikol on 02-Feb-18.
 */
public class HeavenlyBody {
    private final String name;
    private String bodyType;

    private Set<Moon> satellites;
    private Set<Planet> planets;
    private Set<Star> stars;

    public HeavenlyBody(String name) {
        this.name = name;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getName() {
        return name;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public Set<Planet> getPlanets() {
        return new HashSet<>(this.planets);
    }

    public Set<Star> getStars() {
        return new HashSet<>(this.stars);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }

        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 57;
    }



}
