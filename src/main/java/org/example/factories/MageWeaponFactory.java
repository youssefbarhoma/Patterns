package org.example.factories;

import org.example.weapons.FireBall;
import org.example.weapons.Lightning;
import org.example.weapons.Weapon;

public class MageWeaponFactory implements WeaponFactory{

    @Override
    public Weapon createWeapon(char choice) {
        switch (Character.toUpperCase(choice)) {
            case 'F': return new FireBall();
            case 'L': return new Lightning();
            default: throw new IllegalArgumentException("Invalid Warrior weapon choice: " + choice);
        }
    }
}
