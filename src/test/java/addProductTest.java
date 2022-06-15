import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Owner("zannatov")
@Feature("Добавление товара в корзину")
public class addProductTest {

    @Test
    @DisplayName("Добавление товара в корзину через быструю корзину")
    public void addProductToCard() {
        step("Открыть главную страницу", () -> {
            open("http://automationpractice.com/index.php");
        });

        step("Навести курсор на карточку товара", () -> {
            MainPage.productsCards()
                    .get(0)
                    .hover();
        });

        step("Нажать на кнопку 'Add to cart' в карточке товара", () -> {
            MainPage.addToCartButton()
                    .get(0)
                    .click();
        });

        step("Проверить, что появилась модалка с успешным добавлением товара в корзину", () -> {
            MainPage.modalProductCart()
                    .shouldBe(visible);
        });
    }
}
