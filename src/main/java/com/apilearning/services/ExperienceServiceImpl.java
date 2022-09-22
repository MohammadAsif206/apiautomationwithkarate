package com.apilearning.services;

import com.apilearning.daos.ExperienceDAO;
import com.apilearning.daos.ExperienceDAOImpl;
import com.apilearning.entities.Experience;

import java.util.List;

public class ExperienceServiceImpl implements ExperienceService{
    private ExperienceDAO experienceDAO;
    public ExperienceServiceImpl(ExperienceDAO experienceDAO){
        this.experienceDAO = experienceDAO;
    }
    @Override
    public Experience addExperience(Experience experience) {
        return null;
    }

    @Override
    public List<Experience> retrieveAllExperience() {
        return experienceDAO.retrieveAllExperience();
    }
}
