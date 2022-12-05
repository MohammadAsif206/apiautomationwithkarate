package com.apilearning.daos;

import com.apilearning.entities.JobPortal;
import com.apilearning.entities.Pproject;
import com.apilearning.entities.Project;
import com.apilearning.utils.ConnectionUtil;

import java.awt.*;
import java.sql.*;
import java.util.*;

public class JobPortalDAOImpl implements JobPortalDAO {

    @Override
    public JobPortal addJobPortal(JobPortal jobPortal) {
        return null;
    }

    @Override
    public ArrayList<JobPortal> retrieveJobPortal() {
        try(Connection connection = ConnectionUtil.createConnection()) {
            String sql = "select * from jobportal";
            String sql1= "select * from PROJECT";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            PreparedStatement statement1 = connection.prepareStatement(sql1);
            ResultSet rs1 = statement.executeQuery();
           // rs.next();
            ArrayList<JobPortal> arrayList = new ArrayList<>();
            ArrayList<ArrayList<String>> joportal = new ArrayList<>();
            ArrayList<ArrayList<String>> proj = new ArrayList<>();
            int i = 0;

            while (rs.next()){

                int jobId = rs.getInt(1);
                joportal.get(i).add(String.valueOf(jobId));
                String jobTitle = rs.getString(2);
                joportal.get(i).add(jobTitle);

                String exp1 =  rs.getString(3);
                exp1 = exp1.substring(1,exp1.length()-1);
                joportal.get(i).add(exp1);
               // String [] experience = exp1.split(",");


                String jobdescription = rs.getString(4);
                joportal.get(i).add(jobdescription);
//               // Array arrayArray = rs.getArray(5);
//                ArrayList<Pproject> project = new ArrayList<>();
//                String projectName = rs.getString(5);
//                String technology1 = rs.getString(6);
//                technology1 = technology1.substring(1,technology1.length()-1);
//                String [] technology = technology1.split(",");
//                Pproject project1 = new Pproject(projectName,technology);
//               // project1.setProjectId(1);
//              //  project1.setJobid(1);
////                project1.setProjectName(projectName);
////                project1.setTechnology(technology);
//                project.add(project1);
//                JobPortal jobPortal = new JobPortal(jobId,jobTitle,experience,jobdescription,project);
//                arrayList.add(jobPortal);
                i++;
            }
            int j = 0;
            while (rs1.next()){
                int projId = rs1.getInt(1);
                proj.get(j).add(String.valueOf(projId));
                int jobId = rs1.getInt(2);
                proj.get(j).add(String.valueOf(jobId));
                String projectName = rs1.getString(3);
                proj.get(j).add(String.valueOf(projectName));
                String technology = rs1.getString(4);
                technology = technology.substring(1,technology.length()-1);
                proj.get(j).add(technology);
                j++;
            }
            for(int k = 0; k<joportal.size();k++){
                for (int p = 0; p<proj.size(); p++){
                    int flag =0;
                    if(joportal.get(k).get(k)==proj.get(p).get(p)){
                        if(flag<1) {
                            int jobId = Integer.parseInt(joportal.get(k).get(0));
                            int jobTitle = Integer.parseInt(joportal.get(k).get(1));
                            String [] experience = joportal.get(k).get(2).toString().split(",");
                        }
                    }
                }
            }
            return arrayList;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}
