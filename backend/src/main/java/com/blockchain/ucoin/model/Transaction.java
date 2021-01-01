package com.blockchain.ucoin.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "transactions")
public class Transaction extends BaseEntity {
	
    private Double amount;
    
    private UUID receiver;
   
    private UUID sender;

    private Status status;
    
    public enum Status {
    	PENDING,
    	PROCESSED
    }
}
