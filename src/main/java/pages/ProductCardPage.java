package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProductCardPage {

    public static SelenideElement productSize() {
        return $(".selector span");
    }
}
