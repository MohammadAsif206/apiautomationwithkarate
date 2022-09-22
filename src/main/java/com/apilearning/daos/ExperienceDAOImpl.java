package com.apilearning.daos;

import com.apilearning.entities.Experience;
import com.apilearning.utils.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExperienceDAOImpl implements ExperienceDAO {
    @Override
    public Experience addExperience(Experience experience) {
        return null;
    }

    @Override
    public List<Experience> retrieveAllExperience() {
        try (Connection connection = ConnectionUtil.createConnection()) {
            String sql = "select * from experience";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ArrayList<Experience> list = new ArrayList<>();
            while(rs.next()){
                int exid = rs.getInt(1);
                String experience = rs.getString(2);
                int jobid = rs.getInt(3);
                Experience experience1 = new Experience(exid,experience,jobid);
                list.add(experience1);
            }
            return list;

        }catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}
