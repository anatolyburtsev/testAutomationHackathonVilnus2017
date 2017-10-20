package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@AkitaPage.Name("Sign in")
public class SignInPage extends AkitaPage {

    @Name("Логин")
    @FindBy(id = "ap_email")
    private SelenideElement login;

    @Name("Пароль")
    @FindBy(id = "ap_password")
    private SelenideElement password;

    @Name("Войти")
    @FindBy(id = "signInSubmit")
    private SelenideElement enterButton;

}
