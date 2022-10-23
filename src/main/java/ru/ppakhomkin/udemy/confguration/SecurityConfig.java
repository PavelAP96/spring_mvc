package ru.ppakhomkin.udemy.confguration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        UserBuilder userBuilder = User.withDefaultPasswordEncoder();

        auth.inMemoryAuthentication()
                .withUser(userBuilder.username("pasha")
                        .password("pasha")
                        .roles("EMP"))
                .withUser(userBuilder.username("dasha")
                        .password("dasha")
                        .roles("HR"))
                .withUser(userBuilder.username("masha")
                        .password("masha")
                        .roles("HR", "MANAGER"));
    }
}
