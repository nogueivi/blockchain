package com.blockchain.ucoin.model;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity implements Serializable {
    
    @Id
    private UUID id;
    
    @CreatedBy
    private UUID createdBy;
    
    @CreatedDate
    private long createdOn;
    
    @LastModifiedBy
    private long modifiedBy;
    
    @LastModifiedDate
    private long modifiedOn;
    
}
