package com.apilearning.entities;

import java.util.ArrayList;

public class JobPortal {
    private int jobId;
    private String jobTitle;
   private String [] experience;
   private String jobDescription;
   private ArrayList<Pproject> project;


    public JobPortal(int jobId, String jobTitle, String[] experience, String jobDescription, ArrayList<Pproject> project) {
        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.experience = experience;
        this.jobDescription = jobDescription;
        this.project = project;

    }
}
