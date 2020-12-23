package com.blockchain.ucoin.security;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.blockchain.ucoin.model.User;

@Component
public class AuditorAwareImpl implements AuditorAware<UUID> {
    
    @Override
    public Optional<UUID> getCurrentAuditor() {
    	User principal = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return Optional.of(principal.getId());
    }
}
