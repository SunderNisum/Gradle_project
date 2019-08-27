package FirstGradleWithSpringBoot.controller;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloGradleController.class)
@AutoConfigureMockMvc
public class HelloGrandleControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testHelloGradle() throws Exception {
        mvc.perform(get("/"))
        	.andExpect(status().isOk())
        	.andExpect((ResultMatcher) content().string("Hello Gradle!"));
    }

}
