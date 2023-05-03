public class Main {

    public static void main(String[] args) {

        natoAlphabet('B');
        natoAlphabet('F');
    }

    public static String natoAlphabet(char letter){


        switch (letter){
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            case 'F':
                System.out.println("Fox");
                break;
            case 'G':
                System.out.println("George");
                break;
            default:
                System.out.println("Not a letter");


        }
        return "Not a letter";
    }
}
