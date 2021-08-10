package br.com.emersonmendes.study;

import br.com.emersonmendes.study.service.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
public class AppConfig {

    /**
     * Singleton scope: is in PersonService with @service annotation
     * Scopes a single bean definition to a single object instance per Spring IoC container.
     */

    /**
     * Scopes a single bean definition to any number of object instances.
     */
    @Bean
    @Scope("prototype")
    public PersonService personServicePrototype() {
        return new PersonService();
    }

    /**
     * Scopes a single bean definition to the lifecycle of a single HTTP request;
     * that is each and every HTTP request will have its own instance of a bean created off the back of a single bean definition.
     * Only valid in the context of a web-aware Spring ApplicationContext.
     */
    @Bean
    @Scope( value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public PersonService personServiceRequest() {
        return new PersonService();
    }

    /**
     * Scopes a single bean definition to the lifecycle of a HTTP Session.
     * Only valid in the context of a web-aware Spring ApplicationContext.
     */
    @Bean
    @Scope( value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public PersonService personServiceSession() {
        return new PersonService();
    }

}
