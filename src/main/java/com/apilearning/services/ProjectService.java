package com.apilearning.services;

import com.apilearning.entities.Project;

import java.util.List;

public interface ProjectService {
    Project addProject(Project project);
   List<Project> retrieveAllProject();
}
