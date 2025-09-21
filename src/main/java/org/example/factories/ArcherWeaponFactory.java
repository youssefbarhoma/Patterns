package org.example.factories;

import org.example.weapons.CrossBow;
import org.example.weapons.GreatBow;
import org.example.weapons.Weapon;

public class ArcherWeaponFactory implements WeaponFactory{

    @Override
    public Weapon createWeapon(char choice) {
        switch (Character.toUpperCase(choice)) {
            case 'G': return new GreatBow();
            case 'C': return new CrossBow();
            default: throw new IllegalArgumentException("Invalid Warrior weapon choice: " + choice);
        }
    }
}
