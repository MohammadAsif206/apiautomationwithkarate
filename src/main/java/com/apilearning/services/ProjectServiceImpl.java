package com.apilearning.services;

import com.apilearning.daos.ProjectDAO;
import com.apilearning.entities.Project;

import java.util.List;

public class ProjectServiceImpl implements ProjectService{
    private ProjectDAO projectDAO;
    public ProjectServiceImpl(ProjectDAO projectDAO){
        this.projectDAO = projectDAO;
    }
    @Override
    public Project addProject(Project project) {
        return null;
    }

    @Override
    public List<Project> retrieveAllProject() {
        return projectDAO.retrieveAllProject();
    }
}
