package org.example.fighters;

import org.example.Display;
import org.example.attacks.Attacks;
import org.example.factories.ArcherWeaponFactory;
import org.example.factories.WeaponFactory;

public class Archer extends Fighter{

    Display d = Display.getInstance();

    public Archer(){
        super("Archer" , 800 , 300);
        availableWeapons.add("G->GreatBow");
        availableWeapons.add("C->CrossBow");
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
        return new ArcherWeaponFactory();
    }
}
