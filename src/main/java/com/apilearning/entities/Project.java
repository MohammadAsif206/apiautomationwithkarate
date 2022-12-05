package com.apilearning.entities;

public class Project {
    private int projectId;
    private int jobid;
    private String projectName;
    private String [] technology;

//    public Project(int projectId,int jobid, String projectName,String [] technology) {
//        this.projectId = projectId;
//        this.jobid = jobid;
//        this.projectName = projectName;
//        this.technology = technology;
//
//
//    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getJobid() {
        return jobid;
    }

    public void setJobid(int jobid) {
        this.jobid = jobid;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String[] getTechnology() {
        return technology;
    }

    public void setTechnology(String[] technology) {
        this.technology = technology;
    }
}
