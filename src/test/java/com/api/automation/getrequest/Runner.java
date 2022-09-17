package com.api.automation.getrequest;

import com.intuit.karate.junit5.Karate;
import org.apache.commons.logging.Log;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Runner {
    private final Logger logger = LoggerFactory.getLogger(Runner.class.getSimpleName());

//    @Test
//    public Karate runTest(){
//      return   Karate.run("postRequest").relativeTo(getClass());
//
//    }
//    @Test
//    public Karate runTestUsingClassPath(){
//
//       return Karate.run("classpath:com/api/automation/getRequest/postRequest.feature");
//    }
    @Test
    public Karate evalResponseWithMatcher(){
        return Karate.run("evalresponse").relativeTo(getClass());
    }



}
