public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(2000));
        System.out.println(getEvenDigitSum(0));
        System.out.println(getEvenDigitSum(666611116));
        System.out.println(getEvenDigitSum(246824887));
    }

    public static int getEvenDigitSum(int number) {

        int sum = 0;
        int remainder = 0;

        if (number < 0 ) {
            return -1;
        }

        while (number > 0) {
            remainder = number % 10;
            sum += (remainder % 2 == 0) ? remainder : 0;
            number /= 10;
        }
        return sum;
    }

}
