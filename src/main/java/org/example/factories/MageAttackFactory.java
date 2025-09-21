package org.example.factories;

import org.example.attacks.*;

import java.util.Arrays;
import java.util.List;

public class MageAttackFactory implements AttackFactory{
    @Override
    public Attacks createAttack(int choice) {
        switch (choice) {
            case 1: return new FireAttack();
            case 2: return new LightningAttack();
            case 3: return new SingleAttack();
            case 4: return new RandomAttack();
            case 5: return new DoubleAttack();
            default: throw new IllegalArgumentException("Invalid attack choice for Warrior");
        }
    }
    @Override
    public List<String> getAttacks() {
        return Arrays.asList("1-Fire Blast", "2-Lightning Strike" , "3-Single Attack" ,
                            "4-Random Attack", "5-Double Attack");
    }
}
