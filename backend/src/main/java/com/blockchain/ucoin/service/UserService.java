package com.blockchain.ucoin.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.blockchain.ucoin.model.User;
import com.blockchain.ucoin.repository.UserRepository;

@Service
public class UserService {
    
	@Autowired
	private UserRepository userRepository;
	
    public User createUser(User user) {
        return userRepository.save(user);
    }
    
    public User getUser(UUID userId) {
    	return userRepository.getOne(userId);
    }
}
