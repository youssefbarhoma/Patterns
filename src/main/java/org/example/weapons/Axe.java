package org.example.weapons;


public class Axe extends Weapon {

    public Axe(){
        super("Axe" , 400);
        availableAttacks.add("S->SingleAttack");
        availableAttacks.add("D->DoubleAttack");
        availableAttacks.add("R->RandomAttack");
        availableAttacks.add("A->AxeAttack");
    }

}
