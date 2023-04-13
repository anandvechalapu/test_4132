package com.sacral.test_4132.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GithubActivation {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private String githubCredentials;
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getGithubCredentials() {
        return githubCredentials;
    }
 
    public void setGithubCredentials(String githubCredentials) {
        this.githubCredentials = githubCredentials;
    }
 
}