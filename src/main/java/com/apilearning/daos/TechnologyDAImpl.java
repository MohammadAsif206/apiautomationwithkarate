package com.apilearning.daos;

import com.apilearning.entities.Project;
import com.apilearning.entities.Technology;
import com.apilearning.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TechnologyDAImpl implements TechnologyDAO{
    @Override
    public Technology addTechnology(Technology technology) {
        return null;
    }

    @Override
    public List<Technology> retrieveAllTechnologies() {
        try(Connection connection = ConnectionUtil.createConnection()){
            String sql = "select * from technology";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<Technology> technologyArrayList = new ArrayList<>();
            while(resultSet.next()){
                int tid = resultSet.getInt(1);
                String techName = resultSet.getString(2);
                int pid = resultSet.getInt(3);
                Technology technology = new Technology(tid,techName,pid);
                technologyArrayList.add(technology);
            }
            return technologyArrayList;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}
