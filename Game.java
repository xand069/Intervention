import java.util.Scanner;

interface GameMode {
    void start();
}

interface StoryMode extends GameMode {
    void playStory();
}

interface SurvivalMode extends GameMode {
    void playSurvival();
}

class ConsoleGame implements StoryMode, SurvivalMode {
    private String playerName;

    ConsoleGame(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public void start() {
        System.out.println("Press 1 for Story Mode");
        System.out.println("Press 2 for Survival Mode");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                playStory();
                break;
            case 2:
                playSurvival();
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
        }
    }

    @Override
    public void playStory() {
        System.out.println("Welcome to Story Mode, " + playerName + "!");
        // Implement your story mode logic here
    }

    @Override
    public void playSurvival() {
        System.out.println("Welcome to Survival Mode, " + playerName + "!");
        // Implement your survival mode logic here
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        System.out.println("Press P to start playing, " + playerName + ".");
        String startKey = scanner.nextLine();

        if (startKey.equalsIgnoreCase("P")) {
            ConsoleGame game = new ConsoleGame(playerName);
            game.start();
        } else {
            System.out.println("Invalid key. Exiting...");
        }
    }
}
    