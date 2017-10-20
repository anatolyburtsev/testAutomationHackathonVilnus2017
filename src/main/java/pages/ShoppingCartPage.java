package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@AkitaPage.Name("Shopping cart")
public class ShoppingCartPage extends AkitaPage {


    @Name("Proceed  to checkout")
    @FindBy(name = "proceedToCheckout")
    private SelenideElement proceedToCheckout;
}
