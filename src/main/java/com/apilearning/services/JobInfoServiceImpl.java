package com.apilearning.services;

import com.apilearning.daos.JobInfoDAO;
import com.apilearning.daos.JobInfoDAOImpl;
import com.apilearning.entities.JobInfo;

import java.util.List;
import java.util.logging.Logger;

public class JobInfoServiceImpl implements JobInfoService {
    static private Logger logger = Logger.getLogger(JobInfoDAOImpl.class.getSimpleName());
    private JobInfoDAO jobInfoDAO;
    public JobInfoServiceImpl(JobInfoDAO jobInfoDAO){
        this.jobInfoDAO = jobInfoDAO;
    }

    @Override
    public JobInfo addJobDescription(JobInfo jobInfo) {
        jobInfoDAO.addJobDescription(jobInfo);
        return jobInfo;
    }

    @Override
    public List<JobInfo> getAllJobInfoDescription() {
        return jobInfoDAO.getAllJobInfoDescriptions();
    }
}
