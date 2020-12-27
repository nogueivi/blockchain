package com.blockchain.ucoin.configuration;

import com.blockchain.ucoin.security.AuditorAwareImpl;

import java.util.UUID;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef="auditorProvider")
public class PersistenceConfiguration {
    
    @Bean
    AuditorAware<UUID> auditorProvider() {
        return new AuditorAwareImpl();
    }
    
}
