package com.sacral.test_4132.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface JiraActivationRepository extends JpaRepository<JiraActivation, Long> {
    
    @Query("SELECT j FROM JiraActivation j WHERE j.credentials = ?1")
    JiraActivation findByCredentials(String credentials);
    
    JiraActivation findByProjectsAndStories(String projects, String stories);
    
    void deleteByCredentials(String credentials);
}