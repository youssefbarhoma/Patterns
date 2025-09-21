package org.example.attacks;

import org.example.fighters.Fighter;

public class GreatAttack implements Attacks{

    public int getAttackBonus(Fighter f){
        return 200 + f.getBonus();
    }

    @Override
    public int getCharge() {
        return 2;
    }
    @Override
    public String getName() {
        return "GreatBowAttack";
    }
}
