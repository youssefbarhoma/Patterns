package org.example.attacks;

import org.example.fighters.Fighter;

public class FireAttack implements Attacks{

    public int getAttackBonus(Fighter f){
        return 300 + f.getBonus();
    }

    @Override
    public int getCharge() {
        return 2;
    }
    @Override
    public String getName() {
        return "FireBallAttack";
    }
}
