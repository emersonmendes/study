package br.com.emersonmendes.study;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.setup.SharedHttpSessionConfigurer.sharedHttpSession;

@SpringBootTest
@AutoConfigureMockMvc
public class AbstractTest {

    protected MockMvc mvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    /**
     * Implemented this only for shared http session
     */
    @BeforeEach
    public void setUp() {
        this.mvc = MockMvcBuilders
            .webAppContextSetup(webApplicationContext)
            .apply(sharedHttpSession())
            .build();
    }

}
