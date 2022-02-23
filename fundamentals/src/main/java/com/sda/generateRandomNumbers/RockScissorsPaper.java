import java.util.Scanner;

public class RockScissorsPaper {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Choose between rock(0), scissor(1) or paper(2):");
        int chosenNumber = reader.nextInt();

        int minim = 0;
        int maxim = 2;
        int coef = maxim - minim + 1;
        int pcOption = (int) (Math.random() * coef + minim);
        if (pcOption == 0) {
            System.out.println("The machine chose rock.");
        } else if (pcOption == 1) {
            System.out.println("The machine chose scissor.");
        } else {
            System.out.println("The machine chose paper.");
        }
        if (pcOption == chosenNumber) {
            System.out.println("It's a tie.");
        }else if ((chosenNumber == 1 && pcOption == 0) ||
                (chosenNumber == 0 && pcOption == 2) ||
                (chosenNumber == 2 && pcOption == 1))
        {
            System.out.println("The machine won!");
        } else{
            System.out.println("You won!");
        }


    }
}
