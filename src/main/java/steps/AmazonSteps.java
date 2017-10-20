package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.blocks.FiltersBlock;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;
import ru.alfabank.steps.DefaultSteps;

import static ru.alfabank.alfatest.cucumber.api.Pages.getPage;
import static ru.alfabank.alfatest.cucumber.api.Pages.withPage;

public class AmazonSteps {

    @Deprecated
    AkitaScenario akitaScenario;

    private DefaultSteps steps = new DefaultSteps();

    @Given("^user \"([^\"]*)\" enter login and password$")
    public void userEnterLoginAndPassword(String user) {
        steps.loginByUserData(user);
    }

    @Given("^user open page \"([^\"]*)\" by link \"([^\"]*)\" from property file$")
    public void goToPageByLinkFromPropertyFile(String pageName, String linkKey) {
        steps.goToSelectedPageByLinkFromPropertyFile(pageName, linkKey);
    }


    @Then("^page \"([^\"]*)\" was loaded$")
    public void pageWasLoaded(String pageName) {
        steps.loadPage(pageName);
    }

    @When("^user enter to the field \"([^\"]*)\" value \"(.*)\"$")
    public void userEnterToTheFieldValue(String fieldName, String value) {
        steps.setFieldValue(fieldName, value);
    }

    @When("^user click on (?:button|field|checkbox) \"([^\"]*)\"$")
    public void userClickOnButton(String elementName)  {
        steps.clickOnElement(elementName);
    }

    @When("^user (?:select|unselect) filter \"([^\"]*)\"$")
    public void selectFilterByName(String filterToSelect)  {
        FiltersBlock filtersBlock = getPage(FiltersBlock.class, true);
        filtersBlock.selectFilterByName(filterToSelect);
    }
}
