package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public static SelenideElement productsCards() {
        return $(byText("Faded Short Sleeve T-shirts")).as("Название товара в таблице");
    }

    public static SelenideElement addToCartButton() {
        return $("[title='Add to cart']").as("Кнопка добавления в корзину");
    }

    public static SelenideElement modalProductCart() {
        return $("#layer_cart .clearfix").as("Модалка об успешном добавлении товара в корзину");
    }

}
