package com.example.EmployeeManagementSystem.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Auditiorawareimpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // Return the username of the currently logged-in user or a default user
        return Optional.of("system");
    }
}
