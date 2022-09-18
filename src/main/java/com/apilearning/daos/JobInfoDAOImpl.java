package com.apilearning.daos;

import com.apilearning.entities.JobInfo;
import com.apilearning.utils.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class JobInfoDAOImpl implements JobInfoDAO{
    static Logger logger = Logger.getLogger(JobInfoDAOImpl.class.getSimpleName());

    @Override
    public JobInfo addJobDescription(JobInfo jobInfo) {
        try(Connection connection = ConnectionUtil.createConnection()){
//            String sql = "INSERT INTO JOBINFO (jobid,JOBDESCRIPTION,JOBTITLE) VALUES(?,?,?)";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setInt(1,jobInfo.getJobId());
//            ps.setString(2,jobInfo.getJobDescription());
//            ps.setString(3,jobInfo.getJobTitle());
//
//
//            ps.execute(sql);
           // ResultSet rs = ps.getGeneratedKeys();

//            rs.next();
//            int key = rs.getInt("jobId");
//            jobInfo.setJobId(key);
//            connection.commit();
//
//            return jobInfo;
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return null;
            Statement statement = connection.createStatement();
            String q1 = "INSERT INTO JOBINFO (jobid,JOBDESCRIPTION,JOBTITLE) VALUES(4,'My Job','ENG')";
            String q2 = "INSERT INTO JOBINFO (jobid,JOBDESCRIPTION,JOBTITLE) VALUES(5,'Your Job','ENG one')";
            String q3 = "select * from jobinfo";
            ResultSet rs = statement.executeQuery(q3);
            int no_of_rows =0;
            while (rs.next()){
                no_of_rows++;
            }
            System.out.println("Number of rows before commit statement: "+no_of_rows);
            connection.setAutoCommit(false);
            statement.executeQuery(q1);
            statement.executeQuery(q2);
            connection.commit();
            rs = statement.executeQuery(q3);
            int nom_of_rows = 0;
            while (rs.next()){
                nom_of_rows++;
            }
            System.out.println("Number of rows after commit statement: "+nom_of_rows);
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
