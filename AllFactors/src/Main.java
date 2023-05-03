public class Main {

    public static void main(String[] args) {


        printFactors(32);
        printFactors(6);
        printFactors(10);

    }

    public static void printFactors(int numberTest) {

        if(numberTest<1) System.out.println("Invalid Value");
        for (int i = 1; i <= numberTest; i++) {
            if (numberTest % i == 0) System.out.print(i + " ");
    }
        System.out.println(" are factors of " + numberTest);

    }

}
