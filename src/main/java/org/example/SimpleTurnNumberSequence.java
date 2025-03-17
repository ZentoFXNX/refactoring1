package org.example;

public class SimpleTurnNumberSequence implements TurnNumberSequence {
    private int turnNumber = 0;

    @Override
    public synchronized int getNextTurnNumber() {
        return turnNumber++;
    }
}
