package com.apilearning.daos;

import com.apilearning.entities.Project;
import com.apilearning.utils.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProjectDAOImpl implements ProjectDAO{
    @Override
    public Project addProject(Project project) {
        return null;
    }

    @Override
    public List<Project> retrieveAllProject() {
        try (Connection connection = ConnectionUtil.createConnection()){
            String sql = "select * from project";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            //resultSet.next();
            ArrayList<Project> projectArrayLis = new ArrayList<>();
            while (resultSet.next()){
                int projectId = resultSet.getInt(1);
                int jobid = resultSet.getInt(2);
                String projectName = resultSet.getString(3);
                String technology1 = resultSet.getString(4);
                technology1 = technology1.substring(1,technology1.length()-1);
                String [] technology = technology1.split(",");

                Project project = null;//new Project(projectId,jobid,projectName,technology);
                project.setProjectName(projectName);
                project.setTechnology(technology);
                projectArrayLis.add(project);
                System.out.println("This jobID"+projectArrayLis.toString());
            }
            return projectArrayLis;


        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
