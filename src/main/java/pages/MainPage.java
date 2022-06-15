package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    public static ElementsCollection productsCards() {
        return $$(".ajax_block_product");
    }

    public static ElementsCollection addToCartButton() {
        return $$(".ajax_add_to_cart_button");
    }

    public static SelenideElement modalProductCart() {
        return $("#layer_cart .clearfix");
    }

}
