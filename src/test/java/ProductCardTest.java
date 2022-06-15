import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pages.ProductCardPage;

import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.refresh;
import static io.qameta.allure.SeverityLevel.NORMAL;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@Owner("zannatovn")
@Severity(NORMAL)
public class ProductCardTest {

    @MethodSource("sizeData")
    @DisplayName("Проверка размера СКУ")
    @ParameterizedTest(name = "{displayName} : {0}")
    public void shouldOpenProductSize(String sizeUrl, String size){

        open("http://automationpractice.com/index.php?id_product=4&controller=product#/color-beige/"
        + sizeUrl);
        refresh();
        ProductCardPage.productSize()
                .shouldHave(text(size));
    }

    static Stream<Arguments> sizeData() {
        return Stream.of(
                arguments("size-s", "S"),
                arguments("size-m", "M"),
                arguments("size-l", "L")
        );
    }
}
