package com.apilearning.services;

import com.apilearning.daos.JobPortalDAO;
import com.apilearning.entities.JobPortal;
import com.apilearning.entities.Technology;

import java.util.List;

public class JobPortalServiceImpl implements JobPortalService{
    private JobPortalDAO jobPortalDAO;
    public JobPortalServiceImpl(JobPortalDAO jobPortalDAO){
        this.jobPortalDAO = jobPortalDAO;
    }

    @Override
    public JobPortal addJobPortal(JobPortal jobPortal) {
        return null;
    }

    @Override
    public List<JobPortal> retrieveJobPortal() {
        return jobPortalDAO.retrieveJobPortal();
    }
}
