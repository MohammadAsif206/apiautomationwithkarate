package com.learning.getRequest;

import com.intuit.karate.junit5.Karate;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class TestRunner {

    private final Logger logger = Logger.getLogger(TestRunner.class.getSimpleName());

    @Test
    public Karate runHTTPGet(){
        return Karate.run("getRequest").relativeTo(getClass());

    }
}
