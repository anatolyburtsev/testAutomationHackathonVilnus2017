package pages.blocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@AkitaPage.Name("Search block")
public class SearchBlock extends AkitaPage{

    @Name("Search field")
    @FindBy(id = "twotabsearchtextbox")
    private SelenideElement searchField;

    @Name("Go")
    @FindBy(css = "[type = 'submit']")
    private SelenideElement submit;

    @Name("Shopping cart")
    @FindBy(id = "twotabsearchtextbox")
    private SelenideElement cart;

    @FindBy(id = "nav-cart-count")
    @Name("Items Quantity")
    private SelenideElement cartCount;
}
