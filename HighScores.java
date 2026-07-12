package com.example.blackjack;

import java.util.Comparator;

public class HighScores {
    private String name;
    private int score;

    @Override
    public String toString() {
        return name + "," + score;
    }

    public HighScores(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
