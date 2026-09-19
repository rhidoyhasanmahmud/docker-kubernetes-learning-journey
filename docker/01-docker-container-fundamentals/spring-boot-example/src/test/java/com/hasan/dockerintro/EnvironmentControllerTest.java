package com.hasan.dockerintro;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(properties = "app.name=Test Application")
@AutoConfigureMockMvc
class EnvironmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnRuntimeEnvironment() throws Exception {
        mockMvc.perform(get("/api/environment"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.application").value("Test Application"))
                .andExpect(jsonPath("$.hostname").isNotEmpty())
                .andExpect(jsonPath("$.javaVersion").isNotEmpty())
                .andExpect(jsonPath("$.processId").isNumber());
    }
}
