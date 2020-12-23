package com.blockchain.ucoin.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blockchain.ucoin.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
