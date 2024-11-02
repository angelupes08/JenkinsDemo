package com.jenkins.controller;

import com.jenkins.service.JenkinsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class JenkinsController {

    @Autowired
    JenkinsService jenkinsService;

    @GetMapping("")
    public String getInfo(){

        return jenkinsService.getInfo();
    }
}
