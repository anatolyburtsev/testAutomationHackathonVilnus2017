package pages.blocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@AkitaPage.Name("Smart added to Cart")
public class SmartAddedToCardBlock extends AkitaPage {

    @FindBy(id = "smartShelfAddToCartNative")
    @Name("Continue to Card")
    private SelenideElement continueToCardButton;
}
