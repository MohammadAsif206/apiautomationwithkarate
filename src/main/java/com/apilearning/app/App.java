package com.apilearning.app;

import com.apilearning.controllers.JobInfoController;
import com.apilearning.daos.JobInfoDAO;
import com.apilearning.daos.JobInfoDAOImpl;
import com.apilearning.daos.services.JobInfoService;
import com.apilearning.daos.services.JobInfoServiceImpl;
import io.javalin.Javalin;

import java.util.Properties;

public class App {
    public static void main(String[] args){
        Javalin app = Javalin.create(config ->{
            config.enableCorsForAllOrigins();
            config.enableDevLogging();
        });


        JobInfoDAO jobInfoDAO = new JobInfoDAOImpl();
        JobInfoService jobInfoService = new JobInfoServiceImpl(jobInfoDAO);
        JobInfoController jobInfoController = new JobInfoController(jobInfoService);

        app.post("/addJobInfo", jobInfoController.addJobDescription);
        app.get("/retrieveJobInfo", jobInfoController.getAddJobInfoDescription);

        app.start();


    }
}
