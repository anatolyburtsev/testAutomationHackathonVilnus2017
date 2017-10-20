package steps;

import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.experimental.Delegate;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SearchResultsPage;
import pages.blocks.FiltersBlock;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;
import ru.alfabank.steps.DefaultSteps;

import java.util.List;

import static ru.alfabank.alfatest.cucumber.api.Pages.getPage;

public class AmazonSteps {

    @lombok.experimental.Delegate
    private AkitaScenario akitaScenario = AkitaScenario.getInstance();

    private DefaultSteps steps = new DefaultSteps();

    @Given("^user \"([^\"]*)\" enter login and password$")
    public void enterLoginAndPassword(String user) {
        steps.loginByUserData(user);
    }

    @Given("^user open page \"([^\"]*)\" by link \"([^\"]*)\" from property file$")
    public void goToPageByLinkFromPropertyFile(String pageName, String linkKey) {
        steps.goToSelectedPageByLinkFromPropertyFile(pageName, linkKey);
    }

    @Then("^(?:page|block) \"([^\"]*)\" was loaded$")
    public void loadPage(String pageName) {
        steps.loadPage(pageName);
    }

    @When("^user enter to the field \"([^\"]*)\" value \"(.*)\"$")
    public void enterToTheFieldValue(String fieldName, String value) {
        steps.setFieldValue(fieldName, value);
    }

    @When("^user click on (?:button|field|checkbox) \"([^\"]*)\"$")
    public void clickOnButton(String elementName)  {
        steps.clickOnElement(elementName);
    }

    @When("^user (?:select|unselect) filter \"([^\"]*)\"$")
    public void selectFilterByName(String filterToSelect)  {
        FiltersBlock filtersBlock = getPage(FiltersBlock.class, true);
        filtersBlock.selectFilterByName(filterToSelect);
    }

    @Then("^(?:value|text) in field \"([^\"]*)\" equals \"([^\"]*)\"$")
    public void isValueInFieldEquals(String fieldName, String expectedValue) {
        steps.compareValInFieldAndFromStep(fieldName, expectedValue);
    }

    @When("^user select item number \"([^\"]*)\" in search results item$")
    public void userSelectItemNumberInList(int elementNumber) {
        SearchResultsPage searchResultsPage = getPage(SearchResultsPage.class, true);
        searchResultsPage.selectItemInList(elementNumber);
    }

    @When("^user unselect filter Include Out of Stock if selected$")
    public void userUnselectFilterIncludeOutOfStockIfSelected() {
        String filterName = "Include Out of Stock";
        FiltersBlock filtersBlock = getPage(FiltersBlock.class, true);
        String filterState = filtersBlock.getFilterState(filterName);
        if (filterState.equalsIgnoreCase("true")) {
            filtersBlock.selectFilterByName(filterName);
        }
    }

    @When("^count from field \"([^\"]*)\" will be equal (\\d+)$")
    public void countFromFieldWillBeEqual(String fieldName, int count) {
        WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(), 60);
        ExpectedCondition<Boolean> expectation = assertion -> {
            String elementText = akitaScenario.getCurrentPage().getElement(fieldName).innerText();
            System.out.println("elementText = " + elementText);
            if(elementText.equals(String.valueOf(count))){
                return true;
            }
            else {
                steps.refreshPage();
                return false;
            }
        };
        wait.until(expectation);
    }

    @When("^user open page with Music and Dance games$")
    public void userOpenPageWithMusicAndDanceGames() throws Throwable {
        loadPage("Main");
        steps.clickOnElement("Departments");
        loadPage("Department");
        steps.waitForSeconds(1);
        akitaScenario.getCurrentPage().getElementsList("AllCatogiesList").stream()
            .filter(p -> "Video Games".equals(p.getText())).findFirst().get().scrollTo().click();
        loadPage("VideoGames");
        steps.clickOnElement("Playstation4");
        loadPage("VideoGamesPL4");
        akitaScenario.getCurrentPage().getElementsList("categories").stream()
            .filter(p -> "Games".equals(p.getText())).findFirst().get().click();
        loadPage("VideoGamesPL4Games");
        steps.clickOnElement("MusicAndDance");
        loadPage("MusicDanceGames");
//        steps.addValue("HighPrice", "30");
//        akitaScenario.getCurrentPage().getElement("HighPrice").scrollTo();
//        akitaScenario.getCurrentPage().getElement("Go").click();
//        steps.waitForSeconds(1);
        akitaScenario.getCurrentPage().getElementsList("GamesList").get(0).click();
        loadPage("GamePage");
        steps.clickOnElement("addToCart");
    }
}
