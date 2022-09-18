package com.apilearning.daos.services;

import com.apilearning.entities.JobInfo;

import java.util.List;

public interface JobInfoService {
    // Create a job
    JobInfo addJobDescription(JobInfo jobInfo);
    List<JobInfo> getAllJobInfoDescription();

}
