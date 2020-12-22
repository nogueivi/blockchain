package com.blockchain.ucoin.controller;

import com.blockchain.ucoin.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.blockchain.ucoin.resource.BlockMineRequest;

@RestController
@RequestMapping("/blocks")
public class BlockController {
    
    @Autowired
    private BlockService blockService;
    
    @PostMapping("/mine")
    public ResponseEntity<String> mine(@RequestBody BlockMineRequest blockMineRequest) {
        return ResponseEntity.ok(blockService.mine(blockMineRequest.getHash()));
    }
}
