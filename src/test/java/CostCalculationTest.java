import org.example.Calculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CostCalculationTest {


    @Test
    @Tag("PositiveCheck")
    @DisplayName("Проверка c валидными данными ")
    void successfulCheck(){
        Calculation calculation = new Calculation();
        float ressultSum = calculation.costCalculation(20, "large", true, "very high");
        Assertions.assertEquals(1120, ressultSum, "Не работает");
    }

    @Test
    @Tag("NegativeCheck")
    @DisplayName("Проверка с невалидными данными ")
    void negativeCheck(){
        Calculation calculation = new Calculation();
        float ressultSum = calculation.costCalculation(-5, "large", true, "very high");
        Assertions.assertEquals(800, ressultSum, "Не работает");
    }



}
