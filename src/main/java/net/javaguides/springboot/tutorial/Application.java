package net.javaguides.springboot.tutorial;

import org.apache.coyote.http2.Http2Protocol;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Below code is for Programmatically configure http/2, or otherwise 'server.http2.enabled=true'
     * @return
     */
	/*@Bean
	public ConfigurableServletWebServerFactory tomcatCustomizer() {
		var factory = new TomcatServletWebServerFactory();
		factory.addConnectorCustomizers(connector -> connector.addUpgradeProtocol(new Http2Protocol()));
		return factory;
	}*/
}
