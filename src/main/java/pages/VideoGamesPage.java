package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@AkitaPage.Name("VideoGames")
public class VideoGamesPage extends AkitaPage {

    @AkitaPage.Name("Playstation4")
    @FindBy(xpath = "//span[text()='PlayStation 4']")
    private SelenideElement playStation4;
}
