package Game;
import Game.Warrior;
import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {

        System.out.println("Bienvenue dans le super jeu de Thy");
        System.out.println("Choisissez votre classe :");
        System.out.println("1 - Guerrier");
        System.out.println("2 - Mage");

        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();

        switch (choix) {
            case 1:
                Warrior guerrier = creerGuerrier();
                System.out.println("Vous avez choisi le guerrier");
                break;
            case 2:
                // Mage creerMage();
                System.out.println("En cours de construction");
                break;
            default:
                System.out.println("Choix invalide");
                break;
        }
    }

    public static Warrior creerGuerrier() {
        Random random = new Random();
        int attaque = random.nextInt(8) + 20;
        int defense = random.nextInt(4) + 12;
        int mana = random.nextInt(5) + 10;
        return new Warrior(attaque, defense, mana);
    }
}