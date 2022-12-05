package com.apilearning.daos;

import com.apilearning.entities.Technology;

import java.util.List;

public interface TechnologyDAO {
    Technology addTechnology(Technology technology);
    List<Technology> retrieveAllTechnologies();
}
