package com.example.springbootdemo.config;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class SecurityAuditorAware implements AuditorAware<String> {

    private static final String SYSTEM = "System";

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of(SYSTEM);
//        if (UserContext.isAnonymous()) {
//            return Optional.of(SYSTEM);
//        } else {
//            return Optional.of(UserContext.loggedInUserName());
//        }
    }
}
