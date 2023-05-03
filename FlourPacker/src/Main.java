public class Main {

    public static void main(String[] args) {

        System.out.println(canPack(3,0,5));
        System.out.println(canPack(2,1,5));
        System.out.println(canPack(3,-2,12));
        System.out.println(canPack(2,7,18));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int bigKilos = bigCount * 5;
        int smallKilos = smallCount * 1;

        if (bigKilos + smallKilos < goal){
            return false;
        }
        if (goal % 5 > smallKilos){
            return false;
        }

        return true;
    }

}
