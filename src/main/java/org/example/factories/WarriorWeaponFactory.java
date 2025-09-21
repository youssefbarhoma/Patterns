package org.example.factories;

import org.example.weapons.Axe;
import org.example.weapons.Sword;
import org.example.weapons.Weapon;

public class WarriorWeaponFactory implements WeaponFactory{

    @Override
    public Weapon createWeapon(char choice) {
        switch (Character.toUpperCase(choice)) {
            case 'S':
                return new Sword();
            case 'A':
                return new Axe();
            default:
                throw new IllegalArgumentException("Invalid Warrior weapon choice: " + choice);
        }
    }

}
