public class Main {

    public static void main(String[] args) {

        int value = 2;
        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("value was 2");
            case 3 -> System.out.println("value was 3");
            default -> System.out.println("Value not was 1,2 or 3");
        }

        String month = "JEJE";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }



    public static String getQuarter(String month){


        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };

    }
}
