package com.jenkins.controller;

import com.jenkins.service.JenkinsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class JenkinsControllerTest {

    @MockBean
    JenkinsService jenkinsService;

    @Autowired
    JenkinsController jenkinsController;

    @Test
    void getInfo() {

        String expectedResponse = "This is jenkins";

        when(jenkinsService.getInfo()).thenReturn(expectedResponse);

        String actualResponse = jenkinsController.getInfo();

        assertEquals(expectedResponse,actualResponse);
    }
}