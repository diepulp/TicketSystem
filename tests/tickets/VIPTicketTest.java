/*
Assignment: Ticket System
Author: Vladimir Ivanov
Date: 09/25/2011
File: VIPTicketTest.java
 */
package tickets;

import org.junit.Test;

import static org.junit.Assert.*;

public class VIPTicketTest {

    private static VIPTicket  defaultVIP = new VIPTicket();

    @Test
    public void testGetType() {
        assertEquals("Expected type doesnt match", "ViP", defaultVIP.getType());
    }

}