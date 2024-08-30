package com.shraddha.bidding.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shraddha.bidding.model.Bid;

public interface BidRepository extends MongoRepository<Bid, String> {

}
