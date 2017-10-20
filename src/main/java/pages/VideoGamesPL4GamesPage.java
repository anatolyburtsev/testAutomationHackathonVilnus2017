package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@AkitaPage.Name("VideoGamesPL4Games")
public class VideoGamesPL4GamesPage extends AkitaPage {
    @AkitaPage.Name("MusicAndDance")
    @FindBy(xpath = "//span[text()='Music & Dance']")
    private SelenideElement musicAndDance;
}
