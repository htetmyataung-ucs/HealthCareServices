package com.htet.ucs.HealthCareServices.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.htet.ucs.HealthCareServices.services.AuthUserService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	AuthUserService userService;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		  auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.csrf()
		.disable()
		.authorizeRequests()
		.antMatchers("/resources/**","/register","/public/**","/images/**").permitAll()
		.antMatchers("/").hasAnyAuthority("ADMIN","USER")
		.antMatchers("/admin/**").hasAuthority("ADMIN")
		.and()
		.formLogin().loginPage("/login").loginProcessingUrl("/login").usernameParameter("email").permitAll()
		.failureUrl("/login?error=1").defaultSuccessUrl("/", true).permitAll()
		.and().exceptionHandling().accessDeniedPage("/accessdenied")
		.and()
		.logout().logoutUrl("/logout").logoutSuccessUrl("/login").deleteCookies("JSESSIONID").invalidateHttpSession(true).permitAll();
	}
}
