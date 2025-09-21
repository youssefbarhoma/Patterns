package org.example.attacks;

import org.example.fighters.Fighter;

public class RandomAttack implements Attacks{

    public int getAttackBonus(Fighter f){
        int random = (int) (Math.random() * 301);
        return random + f.getBonus();
    }

    @Override
    public int getCharge() {
        return 2;
    }

    @Override
    public String getName() {
        return "RandomAttack";
    }
}
