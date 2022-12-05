package com.apilearning.controllers;

import com.apilearning.entities.Experience;
import com.apilearning.entities.JobInfo;
import com.apilearning.entities.Project;
import com.apilearning.entities.Technology;
import com.apilearning.entities.JobPortal;
import com.apilearning.services.*;
import com.google.gson.Gson;

import io.javalin.http.Handler;

import java.util.List;

public class JobInfoController {
    private Gson gson = new Gson();
    private JobInfoService jobInfoService;
    private ExperienceService experienceService;
    private ProjectService projectService;
    private TechnologyService technologyService;

    private JobPortalService jobPortalService;
    public JobInfoController(JobInfoService jobInfoService, ExperienceService experienceService,
                             ProjectService projectService,TechnologyService technologyService,
                             JobPortalService jobPortalService){
        this.experienceService = experienceService;
        this.jobInfoService = jobInfoService;
        this.projectService = projectService;
        this.technologyService = technologyService;
        this.jobPortalService = jobPortalService;
    }

    public Handler addJobDescription = (ctx) -> {
        JobInfo jobInfo = this.gson.fromJson(ctx.body(),JobInfo.class);
        jobInfo = this.jobInfoService.addJobDescription(jobInfo);
        String jobInfoJSON = gson.toJson(jobInfo);
        ctx.status(201);
        ctx.result(jobInfoJSON);
    };
    public Handler getAddJobInfoDescription = (ctx)->{
        List<JobInfo> jobInfoList = this.jobInfoService.getAllJobInfoDescription();
        String jobInfoJSON = this.gson.toJson(jobInfoList);
        ctx.status(200);
        ctx.result(jobInfoJSON);
    };
    public Handler getExperience = (ctx) -> {
        List<Experience> experienceList = this.experienceService.retrieveAllExperience();
        String experienceJSON = this.gson.toJson(experienceList);
        ctx.status(200);
        ctx.result(experienceJSON);
    };

    public Handler getProjects = (ctx) ->{
        List<Project> projectList = this.projectService.retrieveAllProject();
        String projectJSON = this.gson.toJson(projectList);
        ctx.status(200);
        ctx.result(projectJSON);
    };

    public Handler getTechnology = (ctx)->{
        List<Technology> technologies = technologyService.retrieveAllTechnologies();
        String technologyJSON = this.gson.toJson(technologies);
        ctx.status(200);
        ctx.result(technologyJSON);
    };

    public Handler getRetrieveJobPortal = (ctx)->{
        List<JobPortal> jobPortalList = this.jobPortalService.retrieveJobPortal();
        String jobPortalJSON = this.gson.toJson(jobPortalList);
        ctx.status(200);
        ctx.result(jobPortalJSON);
    };
}
