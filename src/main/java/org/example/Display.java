package org.example;
import org.example.attacks.Attacks;
import org.example.fighters.Fighter;
import java.util.List;
import java.util.Scanner;

public class Display {
    Scanner scanner = new Scanner(System.in);
    private static Display instance;
    private Display(){}

    public static Display getInstance() {
        if (instance == null)
            instance = new Display();
        return instance;
    }

    public void gameStarts(){
        System.out.println("*************************************");
        System.out.println("GAME STARTS");
        System.out.println("*************************************");
    }

    int i = 0;
    public int CharacterDisplay(List<Fighter> fighters){
        i %= 2;
        System.out.println("Choose " + (i + 1) + " character");
        int index = 1;
        for (Fighter fighter : fighters) {
            System.out.println(index + ". " + fighter.getName());
            index++;
        }
        i++;
        return scanner.nextInt();
    }

    public char WeaponsDisplay(Fighter f){
        System.out.println("Choose " + f.getName() + " character weapon");
        for (String weapon : f.getAvailableWeapons()) {
            System.out.println(weapon);
        }
        return scanner.next().charAt(0);
    }

    public int attackDisplay(Fighter f , List<Attacks> attacks){
        System.out.println(f.getName() + " :Choose your way of attack");
        int index = 1;
        for (Attacks a : attacks) {
            System.out.println(index + ". " + a.getName());
            index++;
        }
        i++;
        return scanner.nextInt();
    }

    public void missedShotDisplay(Fighter fighter , Fighter opponent){
        System.out.println(fighter.getName() + " Has missed his shot");
        System.out.println(opponent.getName() + " now has " + opponent.getHealth() + " HP left.");
    }

    public void winnerDisplay(String Winner){
        System.out.println("The Winner is: " + Winner);
    }

    public int EndGame(){
        System.out.println("Wanna play again?");
        System.out.println("1-Play Again");
        System.out.println("2-Exit");
        return scanner.nextInt();
    }

    public int checkCharge(int ch , Fighter f , Attacks a , List<Attacks> attack){
        if (f.getCharge() < a.getCharge()) {
            System.out.println("You are out of charges, please select your Attack again");
            ch = attackDisplay(f , attack);
        }
        else if (f.getCharge() >= a.getCharge()) {
            f.subCharge(a);
        }
        return ch;
    }
}
