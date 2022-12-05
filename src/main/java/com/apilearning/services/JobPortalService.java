package com.apilearning.services;

import com.apilearning.entities.JobPortal;
import com.apilearning.entities.Technology;

import java.util.List;

public interface JobPortalService {
    JobPortal addJobPortal(JobPortal jobPortal);
    List<JobPortal> retrieveJobPortal();

}
