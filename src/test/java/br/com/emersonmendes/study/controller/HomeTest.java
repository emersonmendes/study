package br.com.emersonmendes.study.controller;

import br.com.emersonmendes.study.AbstractTest;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class HomeTest extends AbstractTest {

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mvc
            .perform(get("/"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().string(containsString("Welcome :)")));
    }

}
