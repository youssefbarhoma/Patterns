package org.example.attacks;

import org.example.fighters.Fighter;

public class AxeAttack implements Attacks{

    public int getAttackBonus(Fighter f){
        return 100 + f.getBonus();
    }

    @Override
    public int getCharge() {
        return 2;
    }
    @Override
    public String getName() {
        return "AxeAttack";
    }
}
