package com.blockchain.ucoin.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.blockchain.ucoin.model.Transaction;
import com.blockchain.ucoin.repository.TransactionRepository;

@Service
public class TransactionService {

	private final TransactionRepository transactionRepository;
	
	public TransactionService(TransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
	}
	
	public List<Transaction> getAllFromUser(UUID userId) {
		return transactionRepository.findAllByReceiverOrSender(userId);
	}
}
