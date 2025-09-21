package org.example.fighters;

import org.example.Display;
import org.example.attacks.Attacks;
import org.example.factories.MageWeaponFactory;
import org.example.factories.WeaponFactory;

public class Mage extends Fighter {

    Display d = Display.getInstance();

    public Mage(){
        super("Mage" , 1000 , 250);
        availableWeapons.add("F->FireBall");
        availableWeapons.add("L->Lightning");
    }
    @Override
    public void attack(Fighter opponent, Attacks a) {
        int randomNum = (int)(Math.random() * 101);
        if (randomNum % 5 == 0) {
            d.missedShotDisplay(this , opponent);
            return;
        }
        super.attack(opponent, a);
    }
    @Override
    public WeaponFactory getWeaponFactory() {
        return new MageWeaponFactory();
    }
}
