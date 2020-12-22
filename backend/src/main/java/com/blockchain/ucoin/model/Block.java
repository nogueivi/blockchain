package com.blockchain.ucoin.model;

import com.blockchain.ucoin.utils.SecurityUtils;
import java.util.Date;
import lombok.extern.log4j.Log4j2;
import lombok.Data;

@Data
@Log4j2
public class Block {
    private String data;
    private String hash;
    private String prevHash;
    private long timestamp;
    
    public Block(String data, String prevHash) { 
        this.data = data; 
        this.hash = SecurityUtils.encode(data);
        this.prevHash = prevHash; 
        this.timestamp = new Date().getTime();
        log.info("Creating block with hash: {}", this.hash);
    }
   
}
