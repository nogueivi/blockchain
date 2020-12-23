package com.blockchain.ucoin.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blockchain.ucoin.model.Block;

@Repository
public interface BlockRepository extends JpaRepository<Block, UUID> {

	public Block findTopByOrderByIdDesc();
}
