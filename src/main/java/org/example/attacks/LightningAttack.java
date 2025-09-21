package org.example.attacks;

import org.example.fighters.Fighter;

public class LightningAttack implements Attacks {

    public int getAttackBonus(Fighter f){
        return 250 + f.getBonus();
    }

    @Override
    public int getCharge() {
        return 2;
    }
    @Override
    public String getName() {
        return "LightningAttack";
    }
}
