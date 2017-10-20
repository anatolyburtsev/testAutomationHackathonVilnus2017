package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@AkitaPage.Name("GamePage")
public class GamePage extends AkitaPage {
    @Name("addToCart")
    @FindBy(css = ".add-to-cart-button")
    private SelenideElement addToCart;
}
