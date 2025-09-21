package org.example.factories;

import org.example.fighters.Archer;
import org.example.fighters.Fighter;
import org.example.fighters.Mage;
import org.example.fighters.Warrior;
import java.util.ArrayList;
import java.util.List;

public class FighterFactory {

    private final List<Fighter> fighters = new ArrayList<>();

    public FighterFactory() {
        fighters.add(new Warrior());
        fighters.add(new Mage());
        fighters.add(new Archer());
    }

    public Fighter createFighter(int choice){
        if(choice == 1){
            return new Warrior();
        } else if(choice == 2){
            return new Mage();
        } else if(choice == 3){
            return new Archer();
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public List<Fighter> getFighters() {
        return fighters;
    }
}
