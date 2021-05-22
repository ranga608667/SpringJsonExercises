package com.example.SpringJsonExercises;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.web.bind.annotation.RequestParam;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.is;

@WebMvcTest(MyFirstJsonAPI.class)
public class MyFirstJsonAPITest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void testJsonObject() throws Exception {
        RequestBuilder request=get("/json-object")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON);
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.firstName",is("Thirumalai Raju")))
                .andExpect(jsonPath("$.lastName",is("Rangarajan")));
    }

    @Test
    public void testJsonArray() throws Exception{
        RequestBuilder request=get("/json-array")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON);
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.[1].firstName",is("Surya")))
                .andExpect(jsonPath("$.[2].firstName",is("Rangarajan")));
    }
}
