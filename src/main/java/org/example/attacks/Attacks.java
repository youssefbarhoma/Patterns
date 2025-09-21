package org.example.attacks;

import org.example.fighters.Fighter;

public interface Attacks {
    public int getAttackBonus(Fighter f);
    public int getCharge();
    public String getName();
}
