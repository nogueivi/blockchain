package com.blockchain.ucoin.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class User {
    @Email
    @NotEmpty
    private String email;
    private String firstName;
    private String lastName;
}
