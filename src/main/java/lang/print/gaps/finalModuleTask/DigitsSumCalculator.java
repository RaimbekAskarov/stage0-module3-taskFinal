package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {//1111
        int first = number%10;//1
        number = number/10;//111
        int second = number%10;//1
        number = number/10;//11
        int third = number%10;//1
        number = number/10;
        number = first+second+third+number;
    }
}
