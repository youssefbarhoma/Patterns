package org.example;

import org.example.attacks.Attacks;
import org.example.factories.AttackFactory;
import org.example.fighters.Fighter;

public class Game {
    private final Display d = Display.getInstance();

    private Fighter f1;
    private Fighter f2;

    public Game(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public void runGame() {
        d.gameStarts();

        int i = 0;
        String winner = "";

        while (f1.getHealth() > 0 && f2.getHealth() > 0) {
            if (i % 2 == 0) {
                f1.addCharge();
                System.out.println("Charge 1 is: " + f1.getCharge());

                AttackFactory af = f1.getAttackFactory();
                int ch = d.attackDisplay(f1 , af.getAttacks());
                Attacks att1 = af.createAttack(ch);

                ch = d.checkCharge(ch , f1 , att1 , af.getAttacks());
                att1 = af.createAttack(ch);

                f1.attack(f2, att1);

                winner = "First player " + f1.getName();

            }
            else {
                f2.addCharge();
                System.out.println("Charge 2 is: " + f2.getCharge());

                AttackFactory af = f2.getAttackFactory();
                int ch = d.attackDisplay(f2 , af.getAttacks());
                Attacks att2 = af.createAttack(ch);

                ch = d.checkCharge(ch , f2 , att2 , af.getAttacks());
                att2 = af.createAttack(ch);

                f2.attack(f1, att2);

                winner = "Second player " + f2.getName();
            }
            i++;
        }
        d.winnerDisplay(winner);
    }
}
