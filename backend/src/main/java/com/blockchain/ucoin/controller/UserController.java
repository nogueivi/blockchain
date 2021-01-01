package com.blockchain.ucoin.controller;

import com.blockchain.ucoin.service.TransactionService;
import com.blockchain.ucoin.service.UserService;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blockchain.ucoin.model.Transaction;
import com.blockchain.ucoin.model.User;
import java.net.URI;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/users")
public class UserController {
    
	private final TransactionService transactionService;
	
    private final UserService userService;
    
	public UserController(TransactionService transactionService, UserService userService) {
		this.transactionService = transactionService;
		this.userService = userService;
	}
	
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        URI uri = UriComponentsBuilder.fromUriString("").build().toUri();
        return ResponseEntity.created(uri).body(userService.createUser(user));
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable UUID userId) {
        return ResponseEntity.ok(userService.getUser(userId));
    }
    
    @GetMapping("/{id}/transactions")
    public ResponseEntity<List<Transaction>> getTransactions(@PathVariable UUID userId) {
    	return ResponseEntity.ok(transactionService.getAllFromUser(userId));
    }
    
}