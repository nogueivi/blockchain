package com.blockchain.ucoin.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.blockchain.ucoin.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, UUID> {

	@Query("select t from Transaction t where receiver = :userId or sender = :userId")
	public List<Transaction> findAllByReceiverOrSender(UUID userId);
}
