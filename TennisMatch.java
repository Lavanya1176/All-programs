import java.io.BufferedReader;
import java.io.FileReader;

public class TennisMatch {
    public static void main(String[] args) {
        int[] playerAScores = new int[5];
        int[] playerBScores = new int[5];

        try (BufferedReader br = new BufferedReader(new FileReader("tennis-scores.csv"))) {
            String line;
            int lineNumber = 1;
            while ((line = br.readLine()) != null) {
                String[] scores = line.split(",");
                if (lineNumber == 1) {
                    for (int i = 0; i < 5; i++) {
                        playerAScores[i] = Integer.parseInt(scores[i].trim());
                    }
                } else {
                    for (int i = 0; i < 5; i++) {
                        playerBScores[i] = Integer.parseInt(scores[i].trim());
                    }
                }
                lineNumber++;
            }
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }

        int playerAScoreSum = 0, playerBScoreSum = 0;
        for (int i = 0; i < 5; i++) {
            playerAScoreSum += playerAScores[i];
            playerBScoreSum += playerBScores[i];
        }

        if (playerAScoreSum > playerBScoreSum) {
            System.out.println("Winner is: Player-A");
        } else {
            System.out.println("Winner is: Player-B");
        }
    }
}
