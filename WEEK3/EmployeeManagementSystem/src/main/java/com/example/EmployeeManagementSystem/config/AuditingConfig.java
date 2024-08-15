package com.example.EmployeeManagementSystem.config;

import com.example.EmployeeManagementSystem.security.SpringSecurityAuduiting;
import com.example.EmployeeManagementSystem.security.SpringSecurityAuduiting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.domain.AuditorAware;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class AuditingConfig {

    @Bean
    public AuditorAware<String> auditorProvider() {
        return new SpringSecurityAuduiting();
    }
}

