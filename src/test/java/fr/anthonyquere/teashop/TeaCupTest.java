package fr.anthonyquere.teashop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TeaCupTest {
    @Test
    void should_add_water_to_cup() {
        TeaCup tea_cup = new TeaCup();
        tea_cup.addWater(85);
        assertThat(tea_cup.isReadyToDrink()).isFalse();
    }

    @Test
    void should_add_tea_when_water_is_present() {
        TeaCup tea_cup = new TeaCup();
        Tea tea = new Tea("Green Tea", 120, 80, false);
        tea_cup.addWater(85);
        tea_cup.addTea(tea);
        assertThat(tea_cup.isReadyToDrink()).isFalse();
    }
}