package calc;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("calc")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, htlm:target/CucumberHtmlReports.html")
@ConfigurationParameter(key = "cucumber.filter.tags", value = "@calculator")
public class RunCucumberTest {

}
