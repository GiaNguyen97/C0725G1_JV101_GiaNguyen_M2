package ss8_clean_code.bai_tap.kata_tennis_game;

public class TennisGame {

    private static final String[] SCORE_NAMES = {"Love", "Fifteen", "Thirty", "Forty"};

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            return equalScore(player1Score);
        }
        if (player1Score >= 4 || player2Score >= 4) {
            return advantageOrWin(player1Score, player2Score);
        }
        return normalScore(player1Score, player2Score);
    }

    private static String equalScore(int score) {
        switch (score) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static String advantageOrWin(int player1Score, int player2Score) {
        int scoreDiff = player1Score - player2Score;
        if (scoreDiff == 1) return "Advantage player1";
        if (scoreDiff == -1) return "Advantage player2";
        if (scoreDiff >= 2) return "Win for player1";
        return "Win for player2";
    }

    private static String normalScore(int player1Score, int player2Score) {
        return SCORE_NAMES[player1Score] + "-" + SCORE_NAMES[player2Score];
    }
}
