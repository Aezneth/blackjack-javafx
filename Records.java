package com.example.blackjack;

public class Records {
    private int winRecord;

    @Override
    public String toString() {
        return String.valueOf(winRecord);
    }

    public Records(int winRecord) {
        this.winRecord = winRecord;
    }

    public int getWinRecord() {
        return winRecord;
    }

    public void setWinRecord(int winRecord) {
        this.winRecord = winRecord;
    }
}
