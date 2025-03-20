package fr.anthonyquere.teashop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TeaShopTest {
    @Test
    void should_add_and_retrieve_tea() {
        TeaShop tea_shop = new TeaShop(90);
        Tea tea = new Tea("Oolong", 180, 85, true);
        tea_shop.addTea(tea);
        TeaCup tea_cup = tea_shop.prepareTea("Oolong");
        assertThat(tea_cup.isReadyToDrink()).isFalse();
    }

    @Test
    void should_set_valid_water_temperature() {
        TeaShop tea_shop = new TeaShop(90);
        tea_shop.setWaterTemperature(75);
    }
}