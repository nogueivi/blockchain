package com.blockchain.ucoin.service;

import java.util.UUID;

import org.springframework.stereotype.Service;
import com.blockchain.ucoin.model.User;
import com.blockchain.ucoin.repository.UserRepository;

@Service
public class UserService {
    
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
    public User createUser(User user) {
        return userRepository.save(user);
    }
    
    public User getUser(UUID userId) {
    	return userRepository.getOne(userId);
    }
}
