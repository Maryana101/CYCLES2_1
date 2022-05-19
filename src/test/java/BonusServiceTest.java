import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", delimiter = ';')
    void test(String testName, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
}