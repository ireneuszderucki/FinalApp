package pl.ireneuszderucki.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class SecurityAppConfiguration extends WebSecurityConfigurerAdapter  {

	@Bean
	public UserDetailsService userDetailsService() {
		
		final InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		
		manager.createUser(User.withUsername("irek").password("irek").roles("ADMIN", "USER").build());
		manager.createUser(User.withUsername("monika").password("monika").roles("USER").build());
		
		return manager;
	}
	
	@Override
	protected void configure(final HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.exceptionHandling().accessDeniedPage("/user/403page")
			.and()
			.authorizeRequests()
				.antMatchers("/").permitAll()
				.antMatchers("/company/**").hasAnyRole("ADMIN", "USER")
//				.antMatchers("/home/**").hasAnyRole("ADMIN", "BATMAN")  
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.permitAll();
	}
}