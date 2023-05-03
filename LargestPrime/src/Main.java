public class Main {
    public static void main(String[] args) {

        System.out.println(getLargestPrime(19));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(23));
        System.out.println(getLargestPrime(1147));



    }

    public static int getLargestPrime(int number){
        if (number <= 1){
            return -1;
        }
        int largestPrime = 2;

        for (int i = 2; i <= number; i++){
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }
        return largestPrime;
    }

}
