package org.example.weapons;

public class CrossBow extends Weapon{

    public CrossBow(){
        super("CrossBow" , 200);
        availableAttacks.add("S->SingleAttack");
        availableAttacks.add("D->DoubleAttack");
        availableAttacks.add("R->RandomAttack");
        availableAttacks.add("C->CrossBowAttack");
    }
}
