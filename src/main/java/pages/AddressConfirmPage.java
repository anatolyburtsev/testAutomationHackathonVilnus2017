package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@AkitaPage.Name("Address confirm")
public class AddressConfirmPage extends AkitaPage {

    @FindBy(xpath = "//*[@id=\"address-book-entry-0\"]/div[2]/span/a")
    @Name("Confirm")
    private SelenideElement confirmButton;
}
