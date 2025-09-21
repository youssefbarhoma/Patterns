package org.example;

import org.example.factories.FighterFactory;
import org.example.fighters.Fighter;
import org.example.weapons.Weapon;


public class Main {
    public static void main(String[] args) {
        Display d = Display.getInstance();
        FighterFactory fighter = new FighterFactory();

        while(true) {
            int choice1 = d.CharacterDisplay(fighter.getFighters());
            Fighter f1 = fighter.createFighter(choice1);

            int choice2 = d.CharacterDisplay(fighter.getFighters());
            Fighter f2 = fighter.createFighter(choice2);

            char c1 = d.WeaponsDisplay(f1);
            Weapon w1 = f1.getWeaponFactory().createWeapon(c1);
            f1.setWeapon(w1);

            char c2 = d.WeaponsDisplay(f2);
            Weapon w2 = f2.getWeaponFactory().createWeapon(c2);
            f2.setWeapon(w2);


            Game game = new Game(f1 , f2);
            game.runGame();

            int cont = d.EndGame();
            if(cont == 2){
                return;
            }
        }
    }
}