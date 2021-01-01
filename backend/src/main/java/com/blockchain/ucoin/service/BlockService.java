package com.blockchain.ucoin.service;

import org.springframework.stereotype.Service;

import com.blockchain.ucoin.model.Block;
import com.blockchain.ucoin.repository.BlockRepository;

@Service
public class BlockService {
    
	private final BlockRepository blockRepository;
	
	public BlockService(BlockRepository blockRepository) {
		this.blockRepository = blockRepository;
	}
	
    public String mine(String hash) {
        // TODO
        return hash;
    }
    
    public Block getLastBlock() {
    	return blockRepository.findTopByOrderByIdDesc();
    }
}
