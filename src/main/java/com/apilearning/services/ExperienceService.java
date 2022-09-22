package com.apilearning.services;

import com.apilearning.entities.Experience;

import java.util.List;

public interface ExperienceService {
    // Create experience
    Experience addExperience(Experience experience);
    // retrieve all experiences
    List<Experience> retrieveAllExperience();
}
