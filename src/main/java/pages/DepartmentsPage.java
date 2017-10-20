package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

@AkitaPage.Name("Department")
public class DepartmentsPage extends AkitaPage {

//    @Name("VideoGames")
//    @FindBy(xpath = "//*[text()='Video Games']//*[contains(@class, 'a-link-normal')]")
//    private SelenideElement VideoGames;

    @Name("AllCatogiesList")
    @FindBy(css = ".a-link-normal")
    private List<SelenideElement> categories;
}
