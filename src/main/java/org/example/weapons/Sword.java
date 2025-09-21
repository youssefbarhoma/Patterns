package org.example.weapons;


public class Sword extends Weapon {

    public Sword(){
        super("Sword" , 350);
        availableAttacks.add("S->SingleAttack");
        availableAttacks.add("D->DoubleAttack");
        availableAttacks.add("R->RandomAttack");
        availableAttacks.add("W->SwordAttack");
    }
}
