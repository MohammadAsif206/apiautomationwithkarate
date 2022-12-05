package com.apilearning.app;

import com.apilearning.controllers.JobInfoController;
import com.apilearning.daos.*;
import com.apilearning.services.*;
import io.javalin.Javalin;

public class App {
    public static void main(String[] args){
        Javalin app = Javalin.create(config ->{
            config.enableCorsForAllOrigins();
            config.enableDevLogging();
        });

        JobInfoDAO jobInfoDAO = new JobInfoDAOImpl();
        JobInfoService jobInfoService = new JobInfoServiceImpl(jobInfoDAO);

        ExperienceDAO experienceDAO = new ExperienceDAOImpl();
        ExperienceService experienceService = new ExperienceServiceImpl(experienceDAO);

        ProjectDAO projectDAO = new ProjectDAOImpl();
        ProjectService projectService = new ProjectServiceImpl(projectDAO);

        TechnologyDAO technologyDAO = new TechnologyDAImpl();
        TechnologyService technologyService = new TechnologyServiceImpl(technologyDAO);

        JobPortalDAO jobPortalDAO = new JobPortalDAOImpl();
        JobPortalService jobPortalService = new JobPortalServiceImpl(jobPortalDAO);
        JobInfoController jobInfoController = new JobInfoController(jobInfoService,experienceService,
                projectService,technologyService,jobPortalService);

        app.post("/addJobInfo", jobInfoController.addJobDescription);
        app.get("/retrieveJobInfo", jobInfoController.getAddJobInfoDescription);

        app.get("/retrieveExperience", jobInfoController.getExperience);

        // Project
        app.get("/retrieveProjects", jobInfoController.getProjects);

        //Technology
        app.get("/retrieveTecnologies",jobInfoController.getTechnology);

        // JobPortal
        app.get("/retrieveJobPortal",jobInfoController.getRetrieveJobPortal);

        app.start();


    }
}
