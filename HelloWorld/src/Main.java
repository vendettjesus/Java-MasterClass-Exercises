public class Main {
    public static void main(String[] args) {

        double firstValue = 20.00d;
        double secondValue = 80.00d;

        double bothValues = (firstValue + secondValue) * 100.00d;

        System.out.println("Both values * 100 = " + bothValues);

        double remindOFBothValues = bothValues % 40.00d;

       boolean isNoRemainder = (remindOFBothValues == 0) ? true : false;
        System.out.println("isNoReminder = " + isNoRemainder);
        if (!isNoRemainder){
            System.out.println("got some remainder here");
        }

    }
}