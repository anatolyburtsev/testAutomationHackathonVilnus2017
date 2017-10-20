/**
 * Copyright 2017 Alfa Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;
import ru.alfabank.alfatest.cucumber.api.AkitaPage.Name;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

@Name("Product Details Page")
public class ProductDetailsPage extends AkitaPage {

    @FindBy(id = "imageBlockRightColumn")
    @Name("Product Images List")
    public SelenideElement imagesList;

    @FindBy(xpath = "(//span[@data-action='main-image-click']//img)[2]")
    @Name("Product main image")
    public SelenideElement productMainImage;


}
