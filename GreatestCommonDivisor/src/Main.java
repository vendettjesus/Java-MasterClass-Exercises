public class Main {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(12,36));
        System.out.println(getGreatestCommonDivisor(9,10));
        System.out.println(getGreatestCommonDivisor(81,153));

    }

    public static int getGreatestCommonDivisor(int a, int b) {
        if ((a < 10) || (b < 10)) {
            return -1;
        }
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        // Return the GCD
        return a;
    }

}
