/*
Assignment: Ticket System
Author: Vladimir Ivanov
Date: 09/25/2011
File: TicketTest.java
 */
package tickets;

import org.junit.Test;

import static org.junit.Assert.*;

public class TicketTest {

    private static Ticket defaultTicket = new Ticket();

    @Test
    public void testGetSeatNum(){
        //expected value, method call that you are testing
        assertEquals(1, defaultTicket.getSeatNum());
    }
    @Test
    public void testGetCost(){
        assertEquals(50.0, defaultTicket.getCost(),0.0);
    }

    @Test
    public void testGetType(){
        assertEquals("General Admission", defaultTicket.getType());
    }
}
