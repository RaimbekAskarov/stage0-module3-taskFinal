package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int remainder = number%10;
        int reverse = remainder;
        number = number/10;
        remainder = number%10;
        reverse = reverse*10+remainder;
        number = number/10;
        reverse = reverse*10+number;
        number = reverse;
        System.out.println(number);
    }
}
