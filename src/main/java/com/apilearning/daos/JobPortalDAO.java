package com.apilearning.daos;

import com.apilearning.entities.JobPortal;

import java.util.ArrayList;

public interface JobPortalDAO {
    JobPortal addJobPortal(JobPortal jobPortal);
    ArrayList<JobPortal> retrieveJobPortal();
}
