package com.example.EmployeeManagementSystem.security;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;
import java.util.Optional;

public class SpringSecurityAuduiting implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        // Return the current authenticated user. You might need to adjust this to fit your security setup.
        return Optional.ofNullable(SecurityContextHolder.getContext().getAuthentication())
                .map(auth -> auth.getName());
    }
}
