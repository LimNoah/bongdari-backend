package com.usbridge.bongdari.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class VolunteerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void 봉사공고가져오기_성공() throws Exception {
        mockMvc.perform(get("/api/volunteer/1"))
                .andExpect(status().isOk());
    }

    @Test
    public void 봉사공고가져오기_실패() throws Exception {
        mockMvc.perform(get("/api/volunteer/10000"))
                .andExpect(status().isBadRequest());
    }
}