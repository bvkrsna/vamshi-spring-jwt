/*
package com.springsecurity.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class InMemoryAuthenticationSecurityConfiguration {

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("vamshi")
                .password("bagam")
                .roles("USER")
                .build();

        UserDetails user1 = User.withDefaultPasswordEncoder()
                .username("krishna")
                .password("bagam")
                .roles("USER")
                .build();

        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("bagam")
                .roles("ADMIN")
                .build();


        return new InMemoryUserDetailsManager(user,user1,admin);
    }

}
*/
