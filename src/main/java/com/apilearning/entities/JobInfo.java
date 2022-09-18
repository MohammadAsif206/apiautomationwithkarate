package com.apilearning.entities;

public class JobInfo {
    private int jobId;
    private String jobDescription;
    private String jobTitle;

    public JobInfo(int jobId, String jobDescription, String jobTitle) {
        this.jobId = jobId;
        this.jobDescription = jobDescription;
        this.jobTitle = jobTitle;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
