package org.example.restsecurity.controller.secure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class ApplicationUserConfig {

    @Bean
    public UserDetailsService getDetailsService() {
        return new InMemoryUserDetailsManager(User.withUsername("admin")
                .password("{noop}admin") // {noop} indicates that the password is stored in plain text
                .roles("ADMIN")
                .build());
    }

}
