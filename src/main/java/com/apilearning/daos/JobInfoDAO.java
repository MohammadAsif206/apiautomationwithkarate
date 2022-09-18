package com.apilearning.daos;

import com.apilearning.entities.JobInfo;

import java.util.List;

public interface JobInfoDAO {
    //Create
    JobInfo addJobDescription(JobInfo jobInfo);
    List<JobInfo> getAllJobInfoDescriptions();

}
