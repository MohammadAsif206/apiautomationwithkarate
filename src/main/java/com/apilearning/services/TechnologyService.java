package com.apilearning.services;

import com.apilearning.entities.Technology;

import java.util.List;

public interface TechnologyService {
    Technology addTechnology(Technology technology);
    List<Technology> retrieveAllTechnologies();
}
