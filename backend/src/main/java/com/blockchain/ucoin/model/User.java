package com.blockchain.ucoin.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User extends BaseEntity {
	
    @Email
    @NotEmpty
    private String email;
    
    private String firstName;
    
    private String lastName;
    
    @NotEmpty
    private String password;
    
}
