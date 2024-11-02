package com.jenkins.service;

import org.springframework.stereotype.Service;

@Service
public class JenkinsService {

    public String getInfo(){

        return "This is jenkins";
    }
}
