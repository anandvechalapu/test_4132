package com.sacral.test_4132.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.test_4132.model.GithubActivation;
import com.sacral.test_4132.repository.GithubActivationRepository;

@Service
public class GithubActivationService {
    
    @Autowired
    private GithubActivationRepository githubActivationRepository;
    
    public Optional<GithubActivation> findByGithubCredentials(String githubCredentials) {
        return githubActivationRepository.findByGithubCredentials(githubCredentials);
    }
    
    public void saveGithubActivation(GithubActivation githubActivation) {
        githubActivationRepository.save(githubActivation);
    }
    
    public void deleteGithubActivation(GithubActivation githubActivation) {
        githubActivationRepository.delete(githubActivation);
    }
    
    public void updateGithubActivation(GithubActivation githubActivation) {
        githubActivationRepository.save(githubActivation);
    }
    
}