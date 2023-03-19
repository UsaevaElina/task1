import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.calculate;

public class calculateTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/mounth.csv")
    void shouldCalculateForIncome10Expenses3Threshold20(int expected, int income, int expenses, int threshold) {
        calculate service = new calculate();

        // подготавливаем данные:
//        int income = 10_000;
//        int expenses = 3_000;
//        int threshold = 20_000;
        //int expected = 3;

        // вызываем целевой метод:
        int actual = service.sum(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);


    }

//    @Test
//    void shouldCalculateForIncome100Expenses60Threshold150() {
//        calculate service = new calculate();
//
//        // подготавливаем данные:
//        int income = 100_000;
//        int expenses = 60_000;
//        int threshold = 150_000;
//        int expected = 2;
//
//        // вызываем целевой метод:
//        int actual = service.sum(income, expenses, threshold);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        Assertions.assertEquals(expected, actual);
//
//
//    }

}
