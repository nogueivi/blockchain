package com.blockchain.ucoin.model;

import com.blockchain.ucoin.utils.SecurityUtils;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "blocks")
public class Block extends BaseEntity {
	
    private String data;
    
    private String hash;
    
    private String prevHash;
    
    private long timestamp;
    
    public Block(String data, String prevHash) { 
        this.data = data; 
        this.hash = SecurityUtils.encode(data);
        this.prevHash = prevHash; 
        this.timestamp = new Date().getTime();
    }
   
}
