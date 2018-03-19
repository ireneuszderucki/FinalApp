package pl.ireneuszderucki.webapp;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

import pl.ireneuszderucki.conf.SecurityAppConfiguration;

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

	public SecurityWebApplicationInitializer() {
		super(SecurityAppConfiguration.class);
	}
	
}