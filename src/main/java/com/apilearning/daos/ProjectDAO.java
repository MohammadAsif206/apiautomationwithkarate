package com.apilearning.daos;

import com.apilearning.entities.Project;

import java.util.List;

public interface ProjectDAO {
    Project addProject(Project project);
    List<Project> retrieveAllProject();
}
