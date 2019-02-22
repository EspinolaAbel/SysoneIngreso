package com.sysone.prueba_ingreso.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CompressControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void get_request_to_obtain_candidate() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/candidate/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Abel Espínola")));
    }
    
    @Test
    public void given_a_request_to_compress_a_string_should_return_compressed_string() throws Exception {
        mvc.perform(MockMvcRequestBuilders
        			.post("/compress/")
        			.content("{\"value\": \"AAABBAAAAABB\"}").contentType(MediaType.APPLICATION_JSON)
        			.accept(MediaType.APPLICATION_JSON))
                	.andExpect(content().string(
                			equalTo("{\"compressed\":\"3A2B5A2B\"}")
        			));
    }
    
}