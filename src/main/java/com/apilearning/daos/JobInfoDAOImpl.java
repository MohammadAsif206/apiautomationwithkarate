package com.apilearning.daos;

import com.apilearning.entities.JobInfo;
import com.apilearning.utils.ConnectionUtil;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class JobInfoDAOImpl implements JobInfoDAO{
    static Logger logger = Logger.getLogger(JobInfoDAOImpl.class.getSimpleName());

    @Override
    public JobInfo addJobDescription(JobInfo jobInfo) {
        // Create JSONParser object
        JSONParser jsonParser = new JSONParser();
        try(Connection connection = ConnectionUtil.createConnection()){
            // parsing the contents of the JSON file

            String sql = "INSERT INTO JOBINFO VALUES(default,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           // ps.setInt(1,jobInfo.getJobId());
            ps.setString(1,jobInfo.getJobDescription());
            ps.setString(2,jobInfo.getJobTitle());

            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                int newId = rs.getInt(1);
                jobInfo.setJobId(newId);
            }
            return jobInfo;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;

        }

    }

    @Override
    public List<JobInfo> getAllJobInfoDescriptions() {
        try(Connection connection = ConnectionUtil.createConnection()){
            String sql = "select * from jobInfo";
            PreparedStatement ps =  connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<JobInfo> jobInfoList = new ArrayList<>();
            while (rs.next()){
                int jobId =rs.getInt(1);
                String jobDescription = rs.getString(2);
                String jobTitle = rs.getString(3);
                JobInfo jobInfo = new JobInfo(jobId,jobDescription,jobTitle);
                jobInfoList.add(jobInfo);
            }
            return jobInfoList;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
