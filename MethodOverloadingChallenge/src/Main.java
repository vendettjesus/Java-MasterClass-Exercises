public class Main {

    public static void main(String[] args) {


        double incToCm =convertToCentimeters(12);
        System.out.println("Total centimeters: " +incToCm);
        double feetAndInchesToCm = convertToCentimeters(6,0);
        System.out.println(" Total centimeters: " + feetAndInchesToCm);


    }

    public static double convertToCentimeters(int inches){
        return inches * 2.54d;
    }

    public static double convertToCentimeters(int feet ,int inches){
        return convertToCentimeters((feet * 12) + inches);
    }
}
