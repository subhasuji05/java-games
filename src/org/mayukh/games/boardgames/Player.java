package org.mayukh.games.boardgames;

/**
 * Created by mamukhop on 4/26/2016.
 */
public class Player {

    private int score;
    private final String name;

    public Player (int score, String name) {
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int setScoreAndGet(int score) {
        setScore(score);
        return getScore();
    }

    public String getName() {
        return name;
    }
}