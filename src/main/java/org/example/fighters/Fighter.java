package org.example.fighters;

import org.example.attacks.Attacks;
import org.example.factories.AttackFactory;
import org.example.factories.WeaponFactory;
import org.example.weapons.Weapon;
import java.util.ArrayList;
import java.util.List;

public abstract class Fighter {
    protected String name;
    protected int health;
    protected int bonus;
    protected int charge ;
    protected List<String> availableWeapons;
    protected Weapon weapon;
    private int damageTaken;

    public Fighter(String name, int health , int bonus) {
        this.name = name;
        this.health = health;
        this.bonus = bonus;
        this.charge = 0;
        this.damageTaken = 0;
        this.availableWeapons = new ArrayList<>();
    }

    public void attack(Fighter opponent, Attacks a) {
        int damage = a.getAttackBonus(this);
        System.out.println(name + " attacks with " + a.getClass().getSimpleName()
                + " for " + damage + " damage!");
        takeDamage(damage , opponent);
    }

    public void takeDamage(int damage , Fighter opponent) {
        opponent.damageTaken += damage;
        System.out.println(opponent.getName() + " now has " + opponent.getHealth() + " HP left.");
    }

    public void addCharge(){
        this.charge+=1;
    }

    public void subCharge(Attacks a) {
        this.charge-= a.getCharge();
    }

    public int getHealth() {
        return health + weapon.getHealth() - damageTaken;
    }

    public int getBonus() {
        return bonus;
    }

    public int getCharge() {
        return charge;
    }

    public List<String> getAvailableWeapons() {
        return availableWeapons;
    }

    public String getName() {
        return name;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    public abstract WeaponFactory getWeaponFactory();
    public abstract AttackFactory getAttackFactory();
}

