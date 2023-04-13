package com.sacral.test_4132.service;

import com.sacral.test_4132.repository.JiraActivationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JiraActivationService {
    
    @Autowired
    private JiraActivationRepository jiraActivationRepository;
    
    public JiraActivation findByCredentials(String credentials) {
        return jiraActivationRepository.findByCredentials(credentials);
    }
    
    public JiraActivation findByProjectsAndStories(String projects, String stories) {
        return jiraActivationRepository.findByProjectsAndStories(projects, stories);
    }
    
    public void deleteByCredentials(String credentials) {
        jiraActivationRepository.deleteByCredentials(credentials);
    }
}