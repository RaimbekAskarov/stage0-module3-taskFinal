package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int first = number%10;
        number = number/10;
        int second = number%10;
        number = number/10;
        int third = number%10;
        number = number/10;
        System.out.println(first+second+third+number);
    }
}
