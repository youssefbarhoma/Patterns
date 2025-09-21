package org.example.fighters;

import org.example.factories.AttackFactory;
import org.example.factories.WarriorAttackFactory;
import org.example.factories.WarriorWeaponFactory;
import org.example.factories.WeaponFactory;

public class Warrior extends Fighter {

    public Warrior(){
        super("Warrior", 1100 , 200);
        availableWeapons.add("A->Axe");
        availableWeapons.add("S->Sword");
    }
    @Override
    public WeaponFactory getWeaponFactory() {
        return new WarriorWeaponFactory();
    }
    @Override
    public AttackFactory getAttackFactory() {
        return new WarriorAttackFactory();
    }
}
