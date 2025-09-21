package org.example.attacks;

import org.example.fighters.Fighter;

public class SingleAttack implements Attacks {

    public int getAttackBonus(Fighter f){
        return 50 + f.getBonus();
    }

    @Override
    public int getCharge() {
        return 0;
    }
    @Override
    public String getName() {
        return "SingleAttack";
    }
}
