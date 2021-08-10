package br.com.emersonmendes.study.controller;

import br.com.emersonmendes.study.AbstractTest;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class PersonTest extends AbstractTest {

    @Test
    public void shouldGetAllPersons() throws Exception {
        this.mvc.perform(get("/persons")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$[0].name", is("Alberto de castro e souza")))
            .andExpect(jsonPath("$[0].bloodType", is("AB-")))
            .andExpect(jsonPath("$[0].age", is(90)))
        ;
    }

}
