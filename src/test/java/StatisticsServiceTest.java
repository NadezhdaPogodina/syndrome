import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javamavenqa.service.StatisticsService;

public class StatisticsServiceTest {
    @Test
    public void findMax() {
        StatisticsService service = new StatisticsService();

        int[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        int expected = 12;
        int actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}

