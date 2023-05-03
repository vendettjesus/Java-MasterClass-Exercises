public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(53654979));
        System.out.println(sumFirstAndLastDigit(203));
        System.out.println(sumFirstAndLastDigit(1991));
        System.out.println(sumFirstAndLastDigit(2938));
    }

    public static int sumFirstAndLastDigit(int numberTest) {

        int lastDigit = numberTest % 10;
        int firstDigit = 0;

        if (numberTest < 0)  {
            return -1;
        }

        while (numberTest > 0) {
            firstDigit = numberTest %10;
            numberTest /= 10;
        }

        return lastDigit + firstDigit;

    }
}
