package org.example.attacks;

import org.example.fighters.Fighter;

public class SwordAttack implements Attacks{

    public int getAttackBonus(Fighter f){
        return 200 + f.getBonus();
    }

    @Override
    public int getCharge() {
        return 1;
    }
    @Override
    public String getName() {
        return "SwordAttack";
    }
}
