public class Main {

    public static void main(String[] args) {

        int evenCount = 0;
        int oddCount = 0;
        int number = 1;
        int finishNumber = 20;

        while(number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                oddCount++;
                continue;
            }
            System.out.println("Even number " + number);
            evenCount++;
            if (evenCount >= 5 ) {
                break;
            }

        }
        System.out.println(evenCount + " Total even numbers found");
        System.out.println(oddCount + " Total odd numbers found");
    }

    public static boolean isEvenNumber(int number) {
        if ((number%2)==0){
            return true;
        }else{
            return false;
        }
    }


}
