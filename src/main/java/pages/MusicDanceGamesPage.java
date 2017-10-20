package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

@AkitaPage.Name("MusicDanceGames")
public class MusicDanceGamesPage extends AkitaPage{

    @Name("HighPrice")
    @FindBy(id = "high-price")
    private SelenideElement highPrice;

    @Name("Go")
    @FindBy(xpath = "//*[@id=\"a-autoid-14\"]/span/input")
    private SelenideElement go;

    @Name("GamesList")
    @FindBy(css = ".s-result-item")
    private List<SelenideElement> gamesList;


}
