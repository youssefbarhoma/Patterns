package org.example.factories;

import org.example.fighters.Archer;
import org.example.fighters.Mage;
import org.example.fighters.Warrior;
import org.example.weapons.*;
import org.example.fighters.Fighter;

/*public class WeaponFactory {
    public Weapon createWeapon(char choice , Fighter f) {
        if (choice == 'S' || choice == 's' && f instanceof Warrior) {
            return new Sword();
        } else if (choice == 'A' || choice == 'a' && f instanceof Warrior) {
            return new Axe();
        }  else if(choice == 'F' || choice == 'f' && f instanceof Mage){
            return new FireBall();
        } else if(choice == 'L' || choice == 'l' && f instanceof Mage){
            return new Lightning();
        } else if(choice == 'G' || choice == 'g' && f instanceof Archer){
            return new GreatBow();
        } else if(choice == 'C' || choice == 'c' && f instanceof Archer){
            return new CrossBow();
        }
        else {
            throw new IllegalArgumentException("Invalid weapon choice: " + choice);
        }
    }
}*/
public interface WeaponFactory {
    public Weapon createWeapon(char choice);
}