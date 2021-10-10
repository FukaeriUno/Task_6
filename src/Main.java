public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double result = service.calculate(70, 1.7);
        System.out.printf("%.2f", result);
    }
}
