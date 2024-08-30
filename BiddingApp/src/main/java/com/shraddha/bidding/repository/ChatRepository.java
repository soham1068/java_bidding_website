package com.shraddha.bidding.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.shraddha.bidding.model.Chat;

public interface ChatRepository extends MongoRepository<Chat, String> {
	Optional<Chat> findById(String id);
	
	/* List<String> findBySender(String senderId); */
}
