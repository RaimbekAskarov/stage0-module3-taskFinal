package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int first = number%10;
        number = number/10;
        int second = number%10;
        number = number/10;
        int third = number%10;
        number = number/10;
        int sum = first+second+third+number;
    }
}
