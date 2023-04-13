package com.sacral.test_4132.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.test_4132.model.JiraActivation;
import com.sacral.test_4132.model.GithubActivation;
import com.sacral.test_4132.service.JiraActivationService;
import com.sacral.test_4132.service.GithubActivationService;

@RestController
@RequestMapping("/api")
public class ActivationController {
    
    @Autowired
    private JiraActivationService jiraActivationService;
    
    @Autowired
    private GithubActivationService githubActivationService;
    
    @GetMapping("/jira/{credentials}")
    public JiraActivation getJiraActivationByCredentials(@PathVariable String credentials) {
        return jiraActivationService.findByCredentials(credentials);
    }
    
    @GetMapping("/jira/{projects}/{stories}")
    public JiraActivation getJiraActivationByProjectsAndStories(@PathVariable String projects, @PathVariable String stories) {
        return jiraActivationService.findByProjectsAndStories(projects, stories);
    }
    
    @PostMapping("/jira/{credentials}")
    public void deleteJiraActivationByCredentials(@PathVariable String credentials) {
        jiraActivationService.deleteByCredentials(credentials);
    }
    
    @GetMapping("/github/{credentials}")
    public Optional<GithubActivation> getGithubActivationByCredentials(@PathVariable String credentials) {
        return githubActivationService.findByGithubCredentials(credentials);
    }
    
    @PostMapping("/github")
    public void saveGithubActivation(@RequestBody GithubActivation githubActivation) {
        githubActivationService.saveGithubActivation(githubActivation);
    }
    
    @PostMapping("/github/delete")
    public void deleteGithubActivation(@RequestBody GithubActivation githubActivation) {
        githubActivationService.deleteGithubActivation(githubActivation);
    }
    
    @PostMapping("/github/update")
    public void updateGithubActivation(@RequestBody GithubActivation githubActivation) {
        githubActivationService.updateGithubActivation(githubActivation);
    }
}