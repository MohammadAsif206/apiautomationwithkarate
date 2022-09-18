package com.apilearning.controllers;

import com.apilearning.entities.JobInfo;
import com.apilearning.services.JobInfoService;
import com.google.gson.Gson;

import io.javalin.http.Handler;

import java.util.List;

public class JobInfoController {
    private Gson gson = new Gson();
    private JobInfoService jobInfoService;
    public JobInfoController(JobInfoService jobInfoService){
        this.jobInfoService = jobInfoService;
    }
    public Handler addJobDescription = (ctx) -> {
        JobInfo jobInfo = this.gson.fromJson(ctx.body(),JobInfo.class);
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
}
