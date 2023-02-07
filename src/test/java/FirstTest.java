import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class FirstTest {

//    Product product  =new Product();
    SelenideElement onlineButton = $("div.I1B_- a.J1B_-");
    SelenideElement iconAlfa = $("#react-app > div > div.page.custom-page > div.page__header.page__header_theme_alfa-on-white > header > a.button__component_1wz5e.button__ghost_1wz5e.button__s_1wz5e.button__component_yc42t.button__ghost_yc42t.button__iconOnly_1wz5e.icon-button__primary_1jyes > span > span > svg");
    SelenideElement logField = $("#react-app > div > div.page.custom-page > div.page__content.page__content_offset > div > div.app-login-switcher__tabs > div.tabs__component_1b9p9.app-login-switcher__tab > form > div:nth-child(1) > div > div > div.form-control__input_11wq0 > input");
    SelenideElement passField = $("#react-app > div > div.page.custom-page > div.page__content.page__content_offset > div > div.app-login-switcher__tabs > div.tabs__component_1b9p9.app-login-switcher__tab > form > div.form-control__component_11wq0.form-control__component_1qzsl.login__input.password-input__xl_1qscs.form-control__xl_11wq0.form-control__block_11wq0.form-control__hasRightAddons_11wq0 > div > div.form-control__inputWrapper_11wq0 > div.form-control__input_11wq0 > input");
//строка кода
    // метод
    //класс

    @Test
    public void userCanLoginByUsername() {
        Configuration.holdBrowserOpen = true;
        open("https://alfabank.ru/");
        onlineButton.click();
        iconAlfa.shouldBe(visible);
        logField.setValue("Petr Petrov");
        passField.setValue("123456");
        iconAlfa.click();
        onlineButton.shouldBe(visible);
    }

}





