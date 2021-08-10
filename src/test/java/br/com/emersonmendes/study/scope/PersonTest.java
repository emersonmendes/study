package br.com.emersonmendes.study.scope;

import br.com.emersonmendes.study.AbstractTest;
import br.com.emersonmendes.study.service.PersonService;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.ResultActions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class PersonTest extends AbstractTest  {

    /**
     * Singleton scope
     */
    @Autowired
    @Qualifier("personService")
    public PersonService service2;

    @Autowired
    @Qualifier("personService")
    public PersonService service1;

    /**
     * Prototype scope
     */
    @Autowired
    @Qualifier("personServicePrototype")
    public PersonService servicePrototype1;

    @Autowired
    @Qualifier("personServicePrototype")
    public PersonService servicePrototype2;

    /**
     * Request scope
     */
    @Autowired
    @Qualifier("personServiceRequest")
    public PersonService serviceRequest1;

    @Autowired
    @Qualifier("personServiceRequest")
    public PersonService serviceRequest2;

    /**
     * Session scope
     */
    @Autowired
    @Qualifier("personServiceSession")
    public PersonService serviceSession1;

    @Autowired
    @Qualifier("personServiceRequest")
    public PersonService serviceSession2;

    /**
     * Call from services
     */

    @Test
    public void shouldBeTheSameInstancesForAllSingletonServices()  {
        assertThat(service2.equals(service1)).isEqualTo(true);
    }

    @Test
    public void shouldBeTheSameInstancesForAllRequestServices()  {
        assertThat(serviceRequest1.equals(serviceRequest2)).isEqualTo(true);
    }

    @Test
    public void shouldNotBeTheSameInstancesForAllPrototypeServices()  {
        assertThat(servicePrototype1.equals(servicePrototype2)).isEqualTo(false);
    }

    @Test
    public void shouldBeTheSameInstancesForAllSessionServices()  {
        assertThat(serviceSession1.equals(serviceSession2)).isEqualTo(false);
    }

    /**
     * Call from rest
     */

    @Test
    public void shouldBeTheSameInstancesForAllSingletonServicesWhenHttp() throws Exception {
        final ResultActions resultActions1 = this.mvc.perform(get("/scope/singleton/persons/object")).andExpect(status().isOk());
        final String contentAsString1 = resultActions1.andReturn().getResponse().getContentAsString();
        final ResultActions resultActions2 = this.mvc.perform(get("/scope/singleton/persons/object")).andExpect(status().isOk());
        final String contentAsString2 = resultActions2.andReturn().getResponse().getContentAsString();
        assertThat(contentAsString1).isEqualTo(contentAsString2);
    }

    @Test
    public void shouldNotBeTheSameInstancesForAllRequestServicesWhenHttp() throws Exception {
        final ResultActions resultActions1 = this.mvc.perform(get("/scope/request/persons/object")).andExpect(status().isOk());
        final String contentAsString1 = resultActions1.andReturn().getResponse().getContentAsString();
        final ResultActions resultActions2 = this.mvc.perform(get("/scope/request/persons/object")).andExpect(status().isOk());
        final String contentAsString2 = resultActions2.andReturn().getResponse().getContentAsString();
        assertThat(contentAsString1).isNotEqualTo(contentAsString2);
    }

    @Test
    public void shouldBeTheSameInstancesForAllPrototypeServicesWhenHttp() throws Exception {
        final ResultActions resultActions1 = this.mvc.perform(get("/scope/prototype/persons/object")).andExpect(status().isOk());
        final String contentAsString1 = resultActions1.andReturn().getResponse().getContentAsString();
        final ResultActions resultActions2 = this.mvc.perform(get("/scope/prototype/persons/object")).andExpect(status().isOk());
        final String contentAsString2 = resultActions2.andReturn().getResponse().getContentAsString();
        assertThat(contentAsString1).isEqualTo(contentAsString2);
    }

    @Test
    public void shouldBeTheSameInstancesForAllSessionServicesWhenHttp() throws Exception {
        final ResultActions resultActions1 = this.mvc.perform(get("/scope/session/persons/object")).andExpect(status().isOk());
        final String contentAsString1 = resultActions1.andReturn().getResponse().getContentAsString();
        final ResultActions resultActions2 = this.mvc.perform(get("/scope/session/persons/object")).andExpect(status().isOk());
        final String contentAsString2 = resultActions2.andReturn().getResponse().getContentAsString();
        assertThat(contentAsString1).isEqualTo(contentAsString2);
    }

}
