public class TennisGame {
    public static final String ALL="-All";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String DEUCE = "Deuce";
    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";


    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore=0;
        if (player1Score==player2Score){
            score = getString(player1Score);
        }
        else if (player1Score>=4 || player2Score>=4){
            int minusResult = player1Score-player2Score;
            if (minusResult==1) score = ADVANTAGE_PLAYER_1;
            else if (minusResult ==-1) {
                score = ADVANTAGE_PLAYER_2;
            } else if (minusResult>=2) score = WIN_FOR_PLAYER_1;
            else score = WIN_FOR_PLAYER_2;
        }
        else {
            for (int i=1; i<3; i++) {
                if (i==1) tempScore = player1Score;
                else {
                    score+="-";
                    tempScore = player2Score;
                }
                score = getString(score, tempScore);
            }
        }
        return score;
    }

    private static String getString(String score, int tempScore) {
        switch(tempScore) {
            case 0:
                score += LOVE;
                break;
            case 1:
                score += FIFTEEN;
                break;
            case 2:
                score += THIRTY;
                break;
            case 3:
                score += FORTY;
                break;
        }
        return score;
    }

    private static String getString(int player1Score) {
        String score;
        switch (player1Score){
            case 0:
                score = LOVE+ALL;
                break;
            case 1:
                score = FIFTEEN+ALL;
                break;
            case 2:
                score = THIRTY+ALL;
                break;
            case 3:
                score = FORTY+ALL;
                break;
            default:
                score = DEUCE;
                break;
        }
        return score;
    }

}
