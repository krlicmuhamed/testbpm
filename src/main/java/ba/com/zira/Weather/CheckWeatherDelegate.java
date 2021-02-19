package ba.com.zira.Weather;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;
import java.util.logging.Logger;

public class CheckWeatherDelegate implements JavaDelegate {

    private final Logger LOGGER = Logger.getLogger(LoggerDelegate.class.getName());

    public void execute(DelegateExecution execution) throws Exception {

        Random rand = new Random();

        execution.setVariable("name", "Muhamed");
        execution.setVariable("weatherOk", rand.nextBoolean());

    }
}
