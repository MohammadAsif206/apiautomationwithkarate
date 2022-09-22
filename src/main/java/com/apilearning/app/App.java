package com.apilearning.app;

import com.apilearning.controllers.JobInfoController;
import com.apilearning.daos.ExperienceDAO;
import com.apilearning.daos.ExperienceDAOImpl;
import com.apilearning.daos.JobInfoDAO;
import com.apilearning.daos.JobInfoDAOImpl;
import com.apilearning.services.ExperienceService;
import com.apilearning.services.ExperienceServiceImpl;
import com.apilearning.services.JobInfoService;
import com.apilearning.services.JobInfoServiceImpl;
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
        JobInfoController jobInfoController = new JobInfoController(jobInfoService,experienceService);

        app.post("/addJobInfo", jobInfoController.addJobDescription);
        app.get("/retrieveJobInfo", jobInfoController.getAddJobInfoDescription);

        app.get("/retrieveExperience", jobInfoController.getExperience);

        app.start();


    }
}
