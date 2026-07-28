package org.example.restsecurity.controller.secure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebAuthorizationConfig {

    @Bean
    SecurityFilterChain configure(HttpSecurity http)
            throws Exception {
        http.httpBasic(Customizer.withDefaults());
        /**
         *   var user = User.withUsername("john")              ①
         *         .password("12345")
         *         .authorities("read")
         *         .build();
         *
         *     var userDetailsService =                          ②
         *         new InMemoryUserDetailsManager(user);
         *
         *     http.userDetailsService(userDetailsService);
         */
        http.authorizeHttpRequests(
                c -> c.anyRequest().authenticated()
        );
        return http.build();
    }
}