package org.example.weapons;


public class Lightning extends Weapon{

    public Lightning(){
        super("Lightning" , 100);
        availableAttacks.add("S->SingleAttack");
        availableAttacks.add("D->DoubleAttack");
        availableAttacks.add("R->RandomAttack");
        availableAttacks.add("L->LightningAttack");
    }
}
