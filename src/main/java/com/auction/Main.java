package com.auction;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        AuctionService service = new AuctionService();

        List<Bid> bids = Arrays.asList(
                new Bid("Alice", 100),
                new Bid("Bob", 150),
                new Bid("Charlie", 120)
        );

        Bid winner = service.getHighestBid(bids);

        System.out.println("Winner: " + winner.getBidder());
        System.out.println("Amount: " + winner.getAmount());
    }
}