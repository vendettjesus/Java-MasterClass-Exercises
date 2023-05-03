public class SecondClass {
    public static void main(String[] args) {
        System.out.println("Hello, Pepe");

        boolean isAlien = true;
        if(isAlien == false){
            System.out.println("It is not an alien!, its a human!");
            System.out.println("And I'm scared of aliens");
        }
        System.out.println("IS AN ALIEN!");

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less then 100!");
        }

        if ((topScore>90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true!");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true!");
        }

        boolean isCar = false;
        if (isCar == true){
            System.out.println("Is a car!");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true ;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);
    }
}
