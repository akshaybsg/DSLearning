package com.akshayLocal.DSA.programs.Platform;

public class Score implements Comparable<Score>{

    private int wins, losses;
    public Score(int w, int l)
    {
        wins=w;
        losses=l;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    @Override
    public String toString() {
        return "Score{" +
                "wins=" + wins +
                ", losses=" + losses +
                '}';
    }

    @Override
    public int compareTo(Score o) {
        return 0;
    }
}
