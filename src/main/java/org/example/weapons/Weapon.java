package org.example.weapons;

import java.util.ArrayList;
import java.util.List;

public abstract class Weapon {

    protected String name;
    protected int health;
    protected List<String> availableAttacks;

    public Weapon(String name , int health){
        this.name = name;
        this.health = health;
        this.availableAttacks = new ArrayList<>();
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
}
