package org.example;

public class TicketDispenser {
    private final TurnNumberSequence turnNumberSequence;

    public TicketDispenser(TurnNumberSequence turnNumberSequence) {
        this.turnNumberSequence = turnNumberSequence;
    }

    public TurnTicket getTurnTicket() {
        int newTurnNumber = turnNumberSequence.getNextTurnNumber();
        return new TurnTicket(newTurnNumber);
    }
}
