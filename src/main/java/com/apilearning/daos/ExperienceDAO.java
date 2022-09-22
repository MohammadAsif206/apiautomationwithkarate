package com.apilearning.daos;

import com.apilearning.entities.Experience;

import java.util.List;

public interface ExperienceDAO {
    // Create experience
    Experience addExperience(Experience experience);
    // retrieve all experiences
    List<Experience> retrieveAllExperience();
}
