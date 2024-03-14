public class NextDayCaculator {

    public static final String CONCATE = "/";

    public static String getNextDay(int day, int month, int year) {
        int dayOut = day+1;
        return dayOut+ CONCATE + month+CONCATE+ year;
    }
}
