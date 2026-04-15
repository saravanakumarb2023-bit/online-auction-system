package com.auction;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class AuctionServiceTest {

    AuctionService service = new AuctionService();

    @Test
    void testValidBid() {
        assertTrue(service.isValidBid(100));
        assertFalse(service.isValidBid(-10));
    }

    @Test
    void testHighestBid() {
        List<Bid> bids = Arrays.asList(
                new Bid("A", 50),
                new Bid("B", 200),
                new Bid("C", 100)
        );

        Bid result = service.getHighestBid(bids);
        assertEquals("B", result.getBidder());
    }
}