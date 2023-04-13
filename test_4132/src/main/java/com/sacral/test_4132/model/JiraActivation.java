package com.sacral.test_4132.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JiraActivation {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String credentials;
    private String projects;
    private String stories;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getCredentials() {
        return credentials;
    }
    
    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }
    
    public String getProjects() {
        return projects;
    }
    
    public void setProjects(String projects) {
        this.projects = projects;
    }
    
    public String getStories() {
        return stories;
    }
    
    public void setStories(String stories) {
        this.stories = stories;
    }
}