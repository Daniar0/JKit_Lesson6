package MontyHallSimulation;

import java.util.HashMap;
import java.util.Random;

public class MontyHallSimulation {
    private static final int NUM_SIMULATIONS=1000;

       private HashMap<Integer, String> results = new HashMap<>();
        private int switchWins=0;
        private int stayWins=0;
        public void runSimulation() {
            Random random = new Random();

            for (int i = 0; i < NUM_SIMULATIONS; i++) {
                int prizeDoor = random.nextInt(3);
                int playerChoice = random.nextInt(3);
                int openDoor;
                do {
                    openDoor = random.nextInt(3);
                } while (openDoor == prizeDoor || openDoor == playerChoice);

                int switchChoce = 3 - playerChoice - openDoor;
                if (switchChoce == prizeDoor) {
                    results.put(i, "Switch Win");
                    switchWins++;
                } else {
                    results.put(i, "Stay Win");
                    stayWins++;
                }

            }
        }public void printResults() {
        System.out.println("results step by step:");
        results.forEach((step, result) -> System.out.println("Step"+step + ": "+result));
        System.out.println("\nSummary statistics :");
        System.out.println("wins when changing choice " + switchWins);
        System.out.println("win by leaving choice " + stayWins);
    }

}
