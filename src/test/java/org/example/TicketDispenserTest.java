package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class TicketDispenserTest {

    @Test
    public void testTicketNumberIncrements() {
        TurnNumberSequence mockSequence = mock(TurnNumberSequence.class);
        when(mockSequence.getNextTurnNumber()).thenReturn(0, 1, 2);

        TicketDispenser dispenser = new TicketDispenser(mockSequence);

        assertEquals(0, dispenser.getTurnTicket().getTurnNumber());
        assertEquals(1, dispenser.getTurnTicket().getTurnNumber());
        assertEquals(2, dispenser.getTurnTicket().getTurnNumber());
    }
}
