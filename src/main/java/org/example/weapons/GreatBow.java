package org.example.weapons;


public class GreatBow extends Weapon{

    public GreatBow(){
        super("GreatBow" , 250);
        availableAttacks.add("S->SingleAttack");
        availableAttacks.add("D->DoubleAttack");
        availableAttacks.add("R->RandomAttack");
        availableAttacks.add("G->GreatBowAttack");
    }
}
