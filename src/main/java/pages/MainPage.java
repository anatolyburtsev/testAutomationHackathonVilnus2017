package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

@AkitaPage.Name("Main")
public class MainPage extends AkitaPage {


    @Name("Dashboard")
    @FindBy(id = "hud-dashboard")
    private SelenideElement dashboard;

    @Name("DropdownBox")
    @FindBy(css = ".nav-search-scope")
    private SelenideElement categoryBox;

    @Name("SearchButton")
    @FindBy(css = ".nav-search-submit")
    private SelenideElement searchButton;

    @Name("CategoriesList")
    @FindBy(css = ".nav-search-dropdown")
    private List<SelenideElement> categoriesList;

    @Name("Departments")
    @FindBy(css = ".nav-line-2")
    private SelenideElement departments;

    @Name("MusicAndDance")
    @Optional
    @FindBy(xpath = "//span[text()='Music & Dance']")
    private SelenideElement musicAndDance;


}
