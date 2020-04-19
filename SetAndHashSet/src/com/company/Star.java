package com.company;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nikol on 03-Feb-18.
 */
public class Star extends HeavenlyBody {

    private Set<HeavenlyBody> satellites;

    public Star(String name) {
        super(name);
        this.satellites = new HashSet<>();
    }

    @Override
    public String getName() {
        return super.getName();
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

    public boolean addSattelite(HeavenlyBody hBody){
        this.satellites.add(hBody);
        return true;
    }
}
