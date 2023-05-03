public class MethodChallenge {

    public static void main(String[] args) {



        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Pepe",highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Chuy",highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Rodolfo",highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Angela",highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Pablo",highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get in position: " + highScorePosition +
                 " on the high score list");
    }

    public static int calculateHighScorePosition(int playScore){
        int position = 4;
        if (playScore >= 1000){
            position = 1;
        } else if (playScore >= 500) {
            position = 2;
        } else if (playScore >= 100){
            position = 3;
        }
        return position;
    }
}
