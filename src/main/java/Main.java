import ru.netology.javamavenqa.service.StatisticsService;

public class Main {
    public static void main(String[] args) {
        StatisticsService service = new StatisticsService();

        int[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        int Sum = service.findMax(incomes);
        System.out.println(Sum);
    }
}
