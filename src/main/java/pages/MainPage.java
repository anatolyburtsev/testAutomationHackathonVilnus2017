package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@AkitaPage.Name("Main")
public class MainPage extends AkitaPage {


    @Name("Dashboard")
    @FindBy(id = "hud-dashboard")
    private SelenideElement dashboard;
}
