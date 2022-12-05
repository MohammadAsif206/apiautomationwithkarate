package com.apilearning.services;

import com.apilearning.daos.TechnologyDAO;
import com.apilearning.entities.Technology;

import java.util.List;

public class TechnologyServiceImpl implements TechnologyService{
    private TechnologyDAO technologyDAO;

    public TechnologyServiceImpl(TechnologyDAO technologyDAO) {
        this.technologyDAO = technologyDAO;
    }

    @Override
    public Technology addTechnology(Technology technology) {
        return null;
    }

    @Override
    public List<Technology> retrieveAllTechnologies() {
        return technologyDAO.retrieveAllTechnologies();
    }
}
