package com.auction;

import java.util.*;

public class AuctionService {

    public boolean isValidBid(double amount) {
        return amount > 0;
    }

    public Bid getHighestBid(List<Bid> bids) {
        return bids.stream()
                .max(Comparator.comparingDouble(Bid::getAmount))
                .orElse(null);
    }
}