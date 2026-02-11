import java.util.*;

public class MadLibs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=================================");
        System.out.println("      WELCOME TO MAD LIBS!");
        System.out.println("=================================");

        boolean playAgain = true;

        while (playAgain) {

            System.out.println("\nPlease enter the following words:\n");

            System.out.print("Enter a name: ");
            String name = scanner.nextLine();

            System.out.print("Enter a place: ");
            String place = scanner.nextLine();

            System.out.print("Enter an adjective: ");
            String adjective = scanner.nextLine();

            System.out.print("Enter a noun: ");
            String noun = scanner.nextLine();

            System.out.print("Enter a verb (ending with -ing): ");
            String verb = scanner.nextLine();

            System.out.print("Enter an emotion: ");
            String emotion = scanner.nextLine();

            int storyNumber = random.nextInt(2); // 0 or 1

            System.out.println("\n------ YOUR STORY ------\n");

            if (storyNumber == 0) {

                System.out.println("One day, " + name + " went to " + place + ".");
                System.out.println("It was a very " + adjective + " day.");
                System.out.println("Suddenly, a " + noun + " appeared and started " + verb + "!");
                System.out.println(name + " felt very " + emotion + " after that!");

            } else {

                System.out.println(name + " was walking in " + place + ".");
                System.out.println("Everything looked " + adjective + ".");
                System.out.println("Out of nowhere, a giant " + noun + " came " + verb + "!");
                System.out.println("Everyone felt " + emotion + " that day!");
            }

            System.out.println("\n--------------------------");

            // Ask to play again
            System.out.print("\nDo you want to play again? (yes/no): ");
            String answer = scanner.nextLine();

            if (!answer.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\nThank you for playing Mad Libs!");
        scanner.close();
    }
}

