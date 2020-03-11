package net.javaguides.springboot.tutorial.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@Order(99)
public class DataBaseAccessSecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //@formatter:off
        http
                    .csrf().disable()
                    .headers().frameOptions().sameOrigin()
                .and()
                    .antMatcher("/h2-console/**")
                        .authorizeRequests()
                        .anyRequest().permitAll();
        //@formatter:on
    }
}