package steps;

import cucumber.api.java.en.When;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;
import ru.alfabank.steps.DefaultSteps;

public class AmazonSteps {

    @Deprecated
    AkitaScenario akitaScenario;

    DefaultSteps steps = new DefaultSteps();

    @When("^user \"([^\"]*)\" enter login and password$")
    public void userEnterLoginAndPassword(String user) {
        steps.loginByUserData(user);
    }
}
