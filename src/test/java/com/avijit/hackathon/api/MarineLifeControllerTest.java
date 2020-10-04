package com.avijit.hackathon.api;

import com.avijit.hackathon.api.controller.MarineLifeController;
import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = MarineLifeController.class)
@AutoConfigureMockMvc
@ActiveProfiles("dev")
@WebMvcTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MarineLifeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @SneakyThrows
    @Test
    @DisplayName("Test")
    @Order(1)
    public void test() {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/complaints"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
