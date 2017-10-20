package pages.blocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@AkitaPage.Name("Added to cart")
public class SuccesfulAddedToCartBlock extends AkitaPage {


    @Name("Cart")
    @FindBy(id = "hlb-view-cart-announce")
    private SelenideElement cart;


    @Name("Proceed to checkout")
    @FindBy(id = "hlb-ptc-btn-native")
    private SelenideElement proceedToCheckout;

}
