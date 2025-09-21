package org.example.weapons;


public class FireBall extends Weapon{

    public FireBall(){
        super("FireBall" , 400);
        availableAttacks.add("S->SingleAttack");
        availableAttacks.add("D->DoubleAttack");
        availableAttacks.add("R->RandomAttack");
        availableAttacks.add("F->FireBallAttack");
    }
}
