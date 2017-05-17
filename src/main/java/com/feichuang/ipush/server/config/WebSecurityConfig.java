package com.feichuang.ipush.server.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

// @Configuration
// @EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/", "/henghr/", "/auth/", "/assets/css/*",
                "/assets/img/*", "/assets/js/*", "/soap/*").permitAll()
            .anyRequest().authenticated().and().formLogin()
            .loginPage("/auth/login").permitAll().and().csrf().disable()
            .logout().permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.inMemoryAuthentication().withUser("admin").password("123")
            .roles("USER");
    }

}
