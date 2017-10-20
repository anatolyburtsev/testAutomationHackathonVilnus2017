package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

@AkitaPage.Name("VideoGamesPL4")
public class VideoGamesPL4Page extends AkitaPage{
//    @AkitaPage.Name("Games")
//    @FindBy(xpath = "//span[text()='Games']")
//    private SelenideElement games;

    @Name("categories")
    @FindBy(css = ".a-size-small")
    private List<SelenideElement> categories;

}
