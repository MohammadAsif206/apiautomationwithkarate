package jobservice;

import static com.intuit.karate.Runner.*;

import com.intuit.karate.Runner;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class TestRunner {
    private Logger logger = Logger.getLogger(TestRunner.class.getSimpleName());
    @Test
    public void regressionIntegration(){
      new Runner.Builder()
               .path("classpath:jobservice/features")
               .tags("@regression");

      logger.info("Test result");



    }



//    @Test
//    public Karate runHTTPGet(){
//        return Karate.run("getRequest","variableCreation","validateWithTestDataFromFile",
//        "postRequest").relativeTo(getClass());
//
//    }
}
