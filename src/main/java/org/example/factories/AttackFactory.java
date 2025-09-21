package org.example.factories;

import org.example.attacks.Attacks;
import org.example.attacks.DoubleAttack;
import org.example.attacks.RandomAttack;
import org.example.attacks.SingleAttack;
import java.util.ArrayList;
import java.util.List;


public class AttackFactory {

    private final List<Attacks> attacks = new ArrayList<>();

    public AttackFactory() {
        attacks.add(new SingleAttack());
        attacks.add(new DoubleAttack());
        attacks.add(new RandomAttack());
    }

    public Attacks createAttack(int choice){
        if(choice == 1){
            return new SingleAttack();
        } else if(choice == 2){
            return new DoubleAttack();
        } else if(choice == 3){
            return new RandomAttack();
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public List<Attacks> getAttacks() {
        return attacks;
    }
}