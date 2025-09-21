package org.example.attacks;

import org.example.fighters.Fighter;

public class DoubleAttack implements Attacks {

    public int getAttackBonus(Fighter f){
        return 400 + f.getBonus();
    }

    @Override
    public int getCharge() {
        return 4;
    }

    @Override
    public String getName() {
        return "DoubleAttack";
    }
}
