public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-39,3609));
        System.out.println(getDurationString(85,365));
        System.out.println(getDurationString(98,45));
    }

    public static String getDurationString(int seconds){
        if (seconds < 0){
            return "Invalid data for seconds(" + seconds + "), must be a positive integer value";
        }

        int minutes = seconds/60;
        int hours = minutes/60;

        int forMinutes = minutes%60;
        int forSeconds = seconds%60;

        return hours + "h " + forMinutes + "m " + forSeconds + "s.";
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0 ){
            return "Invalid data for minutes(" + minutes + "), must be a positive integer value";
        }
        if (seconds <= 0 || seconds >= 59){
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59";
        }
        return getDurationString(seconds + (minutes * 60));
    }

}
